package controllers;


import java.io.File;
//import java.sql.Blob;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import models.Artifact;
import org.apache.commons.codec.binary.Base64;

import helper.datasources.MorphiaObject;
import models.Ro;
import models.User;

import org.mongodb.morphia.query.Query;
import play.Routes;

import play.data.DynamicForm;
import play.data.Form;

import play.mvc.*;

import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

import views.html.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;



public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";
	
	public static Result index() {
		return ok(index.render());
	}

	public static User getLocalUser(final Session session) {
		final AuthUser currentAuthUser = PlayAuthenticate.getUser(session);
		final User localUser = User.findByAuthUserIdentity(currentAuthUser);
		return localUser;
	}

	@Restrict(@Group(Application.USER_ROLE))
	public static Result restricted() {
		final User localUser = getLocalUser(session());

		final Query<Ro> query = MorphiaObject.datastore.createQuery(Ro.class).filter("owner =", getLocalUser(session()));
		final List<Ro> ros = query.asList();
		return ok(restricted.render(localUser, ros));
	}

	@Restrict(@Group(Application.USER_ROLE))
	public static Result profile() {
		final User localUser = getLocalUser(session());
		return ok(profile.render(localUser));
	}

	public static Result login() {

		Ro research = new Ro();
		User user = getLocalUser(session());


		//TODO tratar desta zueira


		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}

	public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {



			return UsernamePasswordAuthProvider.handleLogin(ctx());
		}
	}

	public static Result signup() {
		return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}

	public static Result jsRoutes() {
		return ok(
				Routes.javascriptRouter("jsRoutes",
						routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");
	}

	public static Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(signup.render(filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup


			return UsernamePasswordAuthProvider.handleSignup(ctx());
		}
	}

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

	private static  String encodeFileToBase64Binary(File file){
		String encodedfile = null;
		try {
			FileInputStream fileInputStreamReader = new FileInputStream(file);
			byte[] bytes = new byte[(int)file.length()];
			fileInputStreamReader.read(bytes);
			encodedfile = Base64.encodeBase64(bytes).toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return encodedfile;
	}

	public static Result newRo()
	{
		DynamicForm dynamicForm = Form.form().bindFromRequest();
		UUID uniqueId= UUID.randomUUID();

		User owner = getLocalUser(session());

		List<Artifact> artifacts = new ArrayList<Artifact>();

		Ro newRo = new Ro();

		newRo.setUniqueId(uniqueId);
		newRo.setOwner(owner);
		newRo.setName(dynamicForm.get("roname"));
		newRo.setArtifacts(artifacts);

		MorphiaObject.datastore.save(newRo);

		final Query<Ro> query = MorphiaObject.datastore.createQuery(Ro.class).filter("owner =", getLocalUser(session()));
		final List<Ro> finalRos = query.asList();
		return ok(restricted.render(getLocalUser(session()), finalRos));
	}

	public static Result upload() {
		Http.MultipartFormData body = request().body().asMultipartFormData();
		Http.MultipartFormData.FilePart uploadFile = body.getFile("uploadfile");
		if (uploadFile != null) {
			String fileName = uploadFile.getFilename();
			String contentType = uploadFile.getContentType();
			File file = uploadFile.getFile();

			String convertedfile = encodeFileToBase64Binary(file);
			UUID uniqueId= UUID.randomUUID();
			//TODO tratar de UUIDs

			final Query<Ro> query = MorphiaObject.datastore.createQuery(Ro.class).filter("owner =", getLocalUser(session()));
			final List<Ro> ros = query.asList();

			Ro tmpro= ros.get(0);

			List<Artifact> artList = tmpro.getArtifacts();

			if(artList==null)
			{
				artList=new ArrayList<Artifact>();
			}

			Artifact art = new Artifact();
			art.setUniqueId(uniqueId);
			art.setTitle(fileName);
			art.setContent(convertedfile);
			art.setType(contentType);

			artList.add(art);

			tmpro.setArtifacts(artList);

			MorphiaObject.datastore.save(tmpro);

			final List<Ro> finalRos = query.asList();


			return ok(restricted.render(getLocalUser(session()), finalRos));
		} else {
			flash("error", "Missing file");
			return badRequest();
		}
	}



}
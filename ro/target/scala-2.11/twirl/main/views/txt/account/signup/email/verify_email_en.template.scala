
package views.txt.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.txt._

/**/
object verify_email_en extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Howdy """),_display_(/*1.78*/name),format.raw/*1.82*/(""",


You recently signed up for PlayAuthenticate.

To activate your account, follow this link now:
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Cheers,
The PlayAuthenticate Team"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/signup/email/verify_email_en.scala.txt
                  HASH: 5a7f444bdd330f11d36e48ee6d94e0b460597e33
                  MATRIX: 769->1|925->70|958->77|982->81|1112->186|1147->201|1177->205
                  LINES: 26->1|29->1|29->1|29->1|35->7|35->7|37->9
                  -- GENERATED --
              */
          
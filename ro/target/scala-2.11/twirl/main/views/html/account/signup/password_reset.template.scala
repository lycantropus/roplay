
package views.html.account.signup

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
import views.html._

/**/
object password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Signup.PasswordReset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.password.reset.title"))/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.password.reset.title")),format.raw/*8.56*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Signup.doResetPassword)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	   
       """),_display_(/*12.9*/if(resetForm.hasGlobalErrors)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" 
        """),format.raw/*13.9*/("""<p class="error">
          <span class="label label-important">"""),_display_(/*14.48*/resetForm/*14.57*/.globalError.message),format.raw/*14.77*/("""</span>
     	</p>
       """)))}),format.raw/*16.9*/("""
       
        """),_display_(/*18.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*23.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.36*/("""
		    """),format.raw/*24.7*/("""<input type="hidden" value=""""),_display_(/*24.36*/value),format.raw/*24.41*/("""" name=""""),_display_(/*24.50*/name),format.raw/*24.54*/("""" id=""""),_display_(/*24.61*/id),format.raw/*24.63*/("""" """),_display_(/*24.66*/toHtmlArgs(args)),format.raw/*24.82*/(""">
		""")))}),format.raw/*25.4*/("""
	   
	   """),_display_(/*27.6*/_passwordPartial(resetForm)),format.raw/*27.33*/("""
           
		"""),format.raw/*29.3*/("""<input type="submit" value=""""),_display_(/*29.32*/Messages("playauthenticate.password.reset.cta")),format.raw/*29.79*/("""" class="btn btn-primary"> 
	""")))}),format.raw/*30.3*/("""
	"""),format.raw/*31.2*/("""</p>
""")))}))}
  }

  def render(resetForm:Form[controllers.Signup.PasswordReset]): play.twirl.api.HtmlFormat.Appendable = apply(resetForm)

  def f:((Form[controllers.Signup.PasswordReset]) => play.twirl.api.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/signup/password_reset.scala.html
                  HASH: 062084ed103eb24ca9b6ce6062ac1a338f2d4a6a
                  MATRIX: 779->1|966->52|996->109|1024->112|1087->167|1126->169|1157->174|1187->179|1256->228|1297->243|1341->278|1381->280|1423->296|1461->325|1501->327|1539->338|1632->404|1650->413|1691->433|1750->462|1797->482|1909->586|1976->615|2011->623|2067->652|2093->657|2129->666|2154->670|2188->677|2211->679|2241->682|2278->698|2314->704|2353->717|2401->744|2445->761|2501->790|2569->837|2630->868|2660->871
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|43->16|45->18|50->23|50->23|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|52->25|54->27|54->27|56->29|56->29|56->29|57->30|58->31
                  -- GENERATED --
              */
          

package views.html.account

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
object password_change extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Account.PasswordChange],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.change.password.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.change.password.title")),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Account.doChangePassword)/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
	   
       """),_display_(/*12.9*/if(changeForm.hasGlobalErrors)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/(""" 
        """),format.raw/*13.9*/("""<p class="error">
          <span class="label label-important">"""),_display_(/*14.48*/changeForm/*14.58*/.globalError.message),format.raw/*14.78*/("""</span>
     	</p>
       """)))}),format.raw/*16.9*/("""

	   """),_display_(/*18.6*/_passwordPartial(changeForm)),format.raw/*18.34*/("""
           
		"""),format.raw/*20.3*/("""<input type="submit" value=""""),_display_(/*20.32*/Messages("playauthenticate.change.password.cta")),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))}),format.raw/*21.3*/("""
	"""),format.raw/*22.2*/("""</p>
""")))}))}
  }

  def render(changeForm:Form[controllers.Account.PasswordChange]): play.twirl.api.HtmlFormat.Appendable = apply(changeForm)

  def f:((Form[controllers.Account.PasswordChange]) => play.twirl.api.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/password_change.scala.html
                  HASH: 536249be31a54bd2a01d473bef0c9b845cea778d
                  MATRIX: 775->1|965->55|995->112|1023->115|1087->171|1126->173|1157->178|1187->183|1257->233|1298->248|1344->285|1384->287|1426->303|1465->333|1505->335|1543->346|1636->412|1655->422|1696->442|1755->471|1790->480|1839->508|1883->525|1939->554|2008->602|2069->633|2099->636
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|43->16|45->18|45->18|47->20|47->20|47->20|48->21|49->22
                  -- GENERATED --
              */
          
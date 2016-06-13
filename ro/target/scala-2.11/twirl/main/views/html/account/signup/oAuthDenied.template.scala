
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
object oAuthDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main(Messages("playauthenticate.oauth.access.denied.title"))/*3.62*/ {_display_(Seq[Any](format.raw/*3.64*/("""

	"""),format.raw/*5.2*/("""<h1>"""),_display_(/*5.7*/Messages("playauthenticate.oauth.access.denied.title")),format.raw/*5.61*/("""</h1>
	<p>
		"""),_display_(/*7.4*/Messages("playauthenticate.oauth.access.denied.explanation")),format.raw/*7.64*/("""<br/>
	</p>
	<p>
		"""),_display_(/*10.4*/Messages("playauthenticate.oauth.access.denied.alternative")),format.raw/*10.64*/(""" """),format.raw/*10.65*/("""<a href=""""),_display_(/*10.75*/routes/*10.81*/.Application.signup),format.raw/*10.100*/("""">"""),_display_(/*10.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta")),format.raw/*10.167*/("""</a>.
	</p>
""")))}))}
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/signup/oAuthDenied.scala.html
                  HASH: d52afb80b98723bd2368f05b77ef22558507fa3c
                  MATRIX: 744->1|853->22|883->27|951->87|990->89|1021->94|1051->99|1125->153|1166->169|1246->229|1295->252|1376->312|1405->313|1442->323|1457->329|1498->348|1529->351|1615->415
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|38->10|38->10|38->10|38->10|38->10|38->10|38->10|38->10
                  -- GENERATED --
              */
          
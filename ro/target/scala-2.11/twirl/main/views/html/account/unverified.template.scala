
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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

	"""),format.raw/*4.2*/("""<h1>"""),_display_(/*4.7*/Messages("playauthenticate.verify.account.title")),format.raw/*4.56*/("""</h1>
	<p>
	"""),_display_(/*6.3*/Messages("playauthenticate.verify.account.before")),format.raw/*6.53*/(""" """),format.raw/*6.54*/("""<a href=""""),_display_(/*6.64*/routes/*6.70*/.Account.verifyEmail),format.raw/*6.90*/("""">"""),_display_(/*6.93*/Messages("playauthenticate.verify.account.first")),format.raw/*6.142*/("""</a>.<br/>
	</p>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/unverified.scala.html
                  HASH: d0cf0d8752642dd4f77bbfc743e1a33a77dd2a00
                  MATRIX: 811->3|874->58|913->60|944->65|974->70|1043->119|1083->134|1153->184|1181->185|1217->195|1231->201|1271->221|1300->224|1370->273
                  LINES: 29->2|29->2|29->2|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|33->6|33->6|33->6
                  -- GENERATED --
              */
          
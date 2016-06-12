
package views.html

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
object restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User,List[models.Ro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User, roList: List[models.Ro]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*6.72*/ {_display_(Seq[Any](format.raw/*6.74*/("""
    
    """),format.raw/*8.5*/("""<h1>"""),_display_(/*8.10*/Messages("playauthenticate.navigation.restricted")),format.raw/*8.60*/("""</h1>
    <p>
        """),_display_(/*10.10*/Messages("playauthenticate.restricted.secrets")),format.raw/*10.57*/("""
    """),format.raw/*11.5*/("""</p>

    <table class="table" style="width:80%">
        <thead>
            <tr>
                <th>User</th>
                <th>Ro Name</th>
                <th>Ro Owner</th>
            </tr>
        </thead>

    <td>"""),_display_(/*22.10*/localUser/*22.19*/.getIdentifier),format.raw/*22.33*/("""</td>

    """),_display_(/*24.6*/for(ro<-roList) yield /*24.21*/{_display_(Seq[Any](format.raw/*24.22*/("""
            """),format.raw/*25.13*/("""<td>"""),_display_(/*25.18*/ro/*25.20*/.getName),format.raw/*25.28*/("""</td>
            <td>"""),_display_(/*26.18*/ro/*26.20*/.getOwner),format.raw/*26.29*/("""</td>
    """)))}),format.raw/*27.6*/("""
    """),format.raw/*28.5*/("""</table>

    """),_display_(/*30.6*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*30.81*/ {_display_(Seq[Any](format.raw/*30.83*/("""

        """),format.raw/*32.9*/("""<input type="file" name="picture">

        <p>
            <input type="submit">
        </p>

    """)))}),format.raw/*38.6*/("""



""")))}))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 12:03:45 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: e0dd96d93c7c535fa30e756dd9f5e280f5f34410
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1293->265|1361->312|1393->317|1645->542|1663->551|1698->565|1736->577|1767->592|1806->593|1847->606|1879->611|1890->613|1919->621|1969->644|1980->646|2010->655|2051->666|2083->671|2124->686|2208->761|2248->763|2285->773|2416->874
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|38->11|49->22|49->22|49->22|51->24|51->24|51->24|52->25|52->25|52->25|52->25|53->26|53->26|53->26|54->27|55->28|57->30|57->30|57->30|59->32|65->38
                  -- GENERATED --
              */
          
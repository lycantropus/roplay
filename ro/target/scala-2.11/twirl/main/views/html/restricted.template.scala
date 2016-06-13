
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

    <form method="post" action = """"),_display_(/*11.36*/routes/*11.42*/.Application.newRo()),format.raw/*11.62*/("""">
        <td>Research Object Name</td>
        <input type="text"  name="roname">
        <input type="submit">

    </form>
    <!--TODO tentar passar o name pelo cabeçalho da view-->
    <table class="table" style="width:80%">
        <thead>
            <tr>
                <th>Ro Name</th>
                <th>Ro Owner</th>
            </tr>
        </thead>

    <!--<td>"""),_display_(/*26.14*/localUser/*26.23*/.getIdentifier),format.raw/*26.37*/("""</td>-->

    """),_display_(/*28.6*/for(ro<-roList) yield /*28.21*/{_display_(Seq[Any](format.raw/*28.22*/("""
        """),format.raw/*29.9*/("""<tr>
            <td>"""),_display_(/*30.18*/ro/*30.20*/.getName),format.raw/*30.28*/("""</td>
            <td>"""),_display_(/*31.18*/ro/*31.20*/.getOwner),format.raw/*31.29*/("""</td>
            <td>
            """),_display_(/*33.14*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*33.89*/ {_display_(Seq[Any](format.raw/*33.91*/("""
                """),format.raw/*34.17*/("""<input type="file" name="uploadfile" data-buttonText="Your label here.">
                <input type="submit" value="Add">
            """)))}),format.raw/*36.14*/("""
            """),format.raw/*37.13*/("""</td>
        </tr>
    """)))}),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""</table>
""")))}))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 03:10:46 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: 7a635affd093aa6121c2f674a051f1baad998eb1
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1320->292|1335->298|1376->318|1783->698|1801->707|1836->721|1877->736|1908->751|1947->752|1983->761|2032->783|2043->785|2072->793|2122->816|2133->818|2163->827|2226->863|2310->938|2350->940|2395->957|2562->1093|2603->1106|2658->1131|2690->1136
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|38->11|38->11|38->11|53->26|53->26|53->26|55->28|55->28|55->28|56->29|57->30|57->30|57->30|58->31|58->31|58->31|60->33|60->33|60->33|61->34|63->36|64->37|66->39|67->40
                  -- GENERATED --
              */
          
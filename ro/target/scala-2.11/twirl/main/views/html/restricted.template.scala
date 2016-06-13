
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
            <td>"""),_display_(/*31.18*/ro/*31.20*/.getOwner.getIdentifier),format.raw/*31.43*/("""</td>
            """),_display_(/*32.14*/if(ro.getArtifacts!=null)/*32.39*/{_display_(Seq[Any](format.raw/*32.40*/("""


            """),_display_(/*35.14*/for(artifact<-ro.getArtifacts) yield /*35.44*/{_display_(Seq[Any](format.raw/*35.45*/("""
                    """),format.raw/*36.21*/("""<td>"""),_display_(/*36.26*/artifact/*36.34*/.getTitle),format.raw/*36.43*/("""</td>

                """)))}),format.raw/*38.18*/("""
            """)))}),format.raw/*39.14*/("""
            """)))}),format.raw/*40.14*/("""



            """),format.raw/*44.13*/("""<td>
            """),_display_(/*45.14*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*45.89*/ {_display_(Seq[Any](format.raw/*45.91*/("""
                """),format.raw/*46.17*/("""<input type="file" name="uploadfile" data-buttonText="Your label here.">
                <input type="submit" value="Add">
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""</td>
        </tr>
    </table>
    """)))}),format.raw/*52.6*/("""
    """))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 05:34:50 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: c33ae983501e0f3a0b837c75cdb1905661d161cd
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1320->292|1335->298|1376->318|1783->698|1801->707|1836->721|1877->736|1908->751|1947->752|1983->761|2032->783|2043->785|2072->793|2122->816|2133->818|2177->841|2223->860|2257->885|2296->886|2339->902|2385->932|2424->933|2473->954|2505->959|2522->967|2552->976|2607->1000|2652->1014|2697->1028|2741->1044|2786->1062|2870->1137|2910->1139|2955->1156|3122->1292|3163->1305|3231->1343
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|38->11|38->11|38->11|53->26|53->26|53->26|55->28|55->28|55->28|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|62->35|62->35|62->35|63->36|63->36|63->36|63->36|65->38|66->39|67->40|71->44|72->45|72->45|72->45|73->46|75->48|76->49|79->52
                  -- GENERATED --
              */
          
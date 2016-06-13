
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

    <table class="table" style="width:100%">
        <thead>
            <tr>
                <th>Ro Name</th>
                <th>Ro Owner</th>
            </tr>
        </thead>



    """),_display_(/*28.6*/for(ro<-roList) yield /*28.21*/{_display_(Seq[Any](format.raw/*28.22*/("""

        """),format.raw/*30.9*/("""<tr>
            <td>"""),_display_(/*31.18*/ro/*31.20*/.getName),format.raw/*31.28*/("""</td>
            <td>"""),_display_(/*32.18*/ro/*32.20*/.getOwner),format.raw/*32.29*/("""</td>
<td><div>
            """),_display_(/*34.14*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*34.89*/ {_display_(Seq[Any](format.raw/*34.91*/("""
                """),format.raw/*35.17*/("""<input type="file" name="uploadfile" >
                <input type="submit" value="Add">
            """)))}),format.raw/*37.14*/("""
"""),format.raw/*38.1*/("""</div>

</td>
            """),_display_(/*41.14*/if(ro.getArtifacts!=null)/*41.39*/{_display_(Seq[Any](format.raw/*41.40*/("""




            """),_display_(/*46.14*/for(artifact<-ro.getArtifacts) yield /*46.44*/{_display_(Seq[Any](format.raw/*46.45*/("""
                    """),format.raw/*47.21*/("""<td>"""),_display_(/*47.26*/artifact/*47.34*/.getTitle),format.raw/*47.43*/("""</td>

                """)))}),format.raw/*49.18*/("""
            """)))}),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""</tr>






            """)))}),format.raw/*58.14*/("""
    """),format.raw/*59.5*/("""</table>
        """)))}),format.raw/*60.10*/("""




"""))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 08:14:41 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: 00502ae0187263a7d1f5270785e71fe073c67d4e
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1320->292|1335->298|1376->318|1718->634|1749->649|1788->650|1825->660|1874->682|1885->684|1914->692|1964->715|1975->717|2005->726|2061->755|2145->830|2185->832|2230->849|2363->951|2391->952|2445->979|2479->1004|2518->1005|2563->1023|2609->1053|2648->1054|2697->1075|2729->1080|2746->1088|2776->1097|2831->1121|2876->1135|2912->1144|2968->1169|3000->1174|3049->1192
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|38->11|38->11|38->11|55->28|55->28|55->28|57->30|58->31|58->31|58->31|59->32|59->32|59->32|61->34|61->34|61->34|62->35|64->37|65->38|68->41|68->41|68->41|73->46|73->46|73->46|74->47|74->47|74->47|74->47|76->49|77->50|78->51|85->58|86->59|87->60
                  -- GENERATED --
              */
          
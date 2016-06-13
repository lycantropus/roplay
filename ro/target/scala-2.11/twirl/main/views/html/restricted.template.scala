
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
        """),format.raw/*29.9*/("""<div>
        <tr>
            <td>"""),_display_(/*31.18*/ro/*31.20*/.getName),format.raw/*31.28*/("""</td>
            <td>"""),_display_(/*32.18*/ro/*32.20*/.getOwner),format.raw/*32.29*/("""</td>
<td>
            """),_display_(/*34.14*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*34.89*/ {_display_(Seq[Any](format.raw/*34.91*/("""
                """),format.raw/*35.17*/("""<input type="file" name="uploadfile" data-buttonText="Your label here.">
                <input type="submit" value="Add">
            """)))}),format.raw/*37.14*/("""

"""),format.raw/*39.1*/("""</td>
            """),_display_(/*40.14*/if(ro.getArtifacts!=null)/*40.39*/{_display_(Seq[Any](format.raw/*40.40*/("""




            """),_display_(/*45.14*/for(artifact<-ro.getArtifacts) yield /*45.44*/{_display_(Seq[Any](format.raw/*45.45*/("""
                    """),format.raw/*46.21*/("""<td>"""),_display_(/*46.26*/artifact/*46.34*/.getTitle),format.raw/*46.43*/("""</td>

                """)))}),format.raw/*48.18*/("""
            """)))}),format.raw/*49.14*/("""

        """),format.raw/*51.9*/("""</tr>
        </div>




            """)))}),format.raw/*57.14*/("""
    """),format.raw/*58.5*/("""</table>
        """)))}),format.raw/*59.10*/("""




"""))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 07:45:32 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: a8739aff4e9fca7254dd848aea6e615f5d9268b2
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1320->292|1335->298|1376->318|1718->634|1749->649|1788->650|1824->659|1887->695|1898->697|1927->705|1977->728|1988->730|2018->739|2069->763|2153->838|2193->840|2238->857|2405->993|2434->995|2480->1014|2514->1039|2553->1040|2598->1058|2644->1088|2683->1089|2732->1110|2764->1115|2781->1123|2811->1132|2866->1156|2911->1170|2948->1180|3017->1218|3049->1223|3098->1241
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|38->11|38->11|38->11|55->28|55->28|55->28|56->29|58->31|58->31|58->31|59->32|59->32|59->32|61->34|61->34|61->34|62->35|64->37|66->39|67->40|67->40|67->40|72->45|72->45|72->45|73->46|73->46|73->46|73->46|75->48|76->49|78->51|84->57|85->58|86->59
                  -- GENERATED --
              */
          
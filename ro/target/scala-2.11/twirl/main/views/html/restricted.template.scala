
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
                <th>Ro Name</th>
                <th>Ro Owner</th>
            </tr>
        </thead>

    <!--<td>"""),_display_(/*21.14*/localUser/*21.23*/.getIdentifier),format.raw/*21.37*/("""</td>-->

    """),_display_(/*23.6*/for(ro<-roList) yield /*23.21*/{_display_(Seq[Any](format.raw/*23.22*/("""
        """),format.raw/*24.9*/("""<tr>
            <td>"""),_display_(/*25.18*/ro/*25.20*/.getName),format.raw/*25.28*/("""</td>
            <td>"""),_display_(/*26.18*/ro/*26.20*/.getOwner),format.raw/*26.29*/("""</td>
            <td>
            """),_display_(/*28.14*/form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*28.89*/ {_display_(Seq[Any](format.raw/*28.91*/("""
                """),format.raw/*29.17*/("""<input type="file" name="uploadfile">
                <input type="submit">
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""</td>
        </tr>
    """)))}),format.raw/*34.6*/("""
    """),format.raw/*35.5*/("""</table>
""")))}))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/restricted.scala.html
                  HASH: e79f8a8fe0c29f27776c1273e4e9fa6befe22804
                  MATRIX: 749->1|934->50|964->107|992->110|1070->180|1109->182|1147->194|1178->199|1248->249|1300->274|1368->321|1401->327|1637->536|1655->545|1690->559|1733->576|1764->591|1803->592|1840->602|1890->625|1901->627|1930->635|1981->659|1992->661|2022->670|2087->708|2171->783|2211->785|2257->803|2379->894|2421->908|2478->935|2511->941
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|38->11|48->21|48->21|48->21|50->23|50->23|50->23|51->24|52->25|52->25|52->25|53->26|53->26|53->26|55->28|55->28|55->28|56->29|58->31|59->32|61->34|62->35
                  -- GENERATED --
              */
          
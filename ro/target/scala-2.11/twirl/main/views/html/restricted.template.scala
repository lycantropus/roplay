
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
object restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*3.72*/ {_display_(Seq[Any](format.raw/*3.74*/("""
    
    """),format.raw/*5.5*/("""<h1>"""),_display_(/*5.10*/Messages("playauthenticate.navigation.restricted")),format.raw/*5.60*/("""</h1>
    <p>
        """),_display_(/*7.10*/Messages("playauthenticate.restricted.secrets")),format.raw/*7.57*/("""
    """),format.raw/*8.5*/("""</p>
        <div id="file-uploader">
            <noscript>
                <p>Please enable JavaScript to use file uploader.</p>
                    <!-- or put a simple form for upload here -->
            </noscript>

            <script>
            function createUploader()"""),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
                """),format.raw/*17.17*/("""var uploader = new qq.FileUploader("""),format.raw/*17.52*/("""{"""),format.raw/*17.53*/("""
                    """),format.raw/*18.21*/("""element: document.getElementById('file-uploader'),
                    action: '/upload',
                    debug: true
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/(""");
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""// in your app create uploader as soon as the DOM is ready
            // don't wait for the window to load
            window.onload = createUploader;
        </script>
        </div>

""")))}))}
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 03:17:19 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: 5eaa724fd32bd4f4182e9a727d8c46d085334619
                  MATRIX: 733->1|852->32|880->35|958->105|997->107|1033->117|1064->122|1134->172|1183->195|1250->242|1281->247|1589->527|1618->528|1663->545|1726->580|1755->581|1804->602|1970->740|1999->741|2042->756|2071->757|2113->771
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|36->8|44->16|44->16|45->17|45->17|45->17|46->18|49->21|49->21|50->22|50->22|52->24
                  -- GENERATED --
              */
          
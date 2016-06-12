
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

    <table class="table" style="width:50%">
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

    <form action="" method="post">
        <div>
            <label>Description</label>
            <input type="text" name="desc" value="">
        </div>
        <div>
            <img id="img">
        </div>
        <div>
            <button class="btn" id="upload" type="button">Upload</button>
        </div>
        <div>
            <button class="btn">Submit</button>
        </div>
    </form>

    <script type="text/javascript">
    $(function()"""),format.raw/*47.17*/("""{"""),format.raw/*47.18*/("""
        """),format.raw/*48.9*/("""var uploader = new plupload.Uploader("""),format.raw/*48.46*/("""{"""),format.raw/*48.47*/("""
            """),format.raw/*49.13*/("""runtimes : 'html5,silverlight,browserplus,flash,gears',
            browse_button: 'upload',
            max_file_size: '3mb',
            url: '',
            multipart: true,
            flash_swf_url: '/js/plupload/plupload.flash.swf',
            silverlight_xap_url : '/js/plupload/plupload.silverlight.xap',
            filters : ["""),format.raw/*56.24*/("""{"""),format.raw/*56.25*/("""title: "Image files", extensions : "jpg,png,gif,jpeg,bmp""""),format.raw/*56.82*/("""}"""),format.raw/*56.83*/("""]
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""");
        uploader.bind('FilesAdded', function(up, files)"""),format.raw/*58.56*/("""{"""),format.raw/*58.57*/("""
            """),format.raw/*59.13*/("""//var file = files[files.length - 1]
            while (files.length > 1) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
                """),format.raw/*61.17*/("""up.removeFile(files[0]);
                files.shift();
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""var name = files[0].name;
            uploader.curFileName = name;
            setTimeout(function()"""),format.raw/*66.34*/("""{"""),format.raw/*66.35*/("""uploader.start();"""),format.raw/*66.52*/("""}"""),format.raw/*66.53*/(""", 500);
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""");
        uploader.bind('FileUploaded', function(up, file, response)"""),format.raw/*68.67*/("""{"""),format.raw/*68.68*/("""
            """),format.raw/*69.13*/("""alert("File uploaded");
            console.log(response);
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""");
        uploader.bind('Error', function(up, error)"""),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
            """),format.raw/*73.13*/("""alert("Error encountered");
            console.log(error);
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/(""");
        uploader.init();
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""")
</script>

""")))}))}
  }

  def render(localUser:models.User,roList:List[models.Ro]): play.twirl.api.HtmlFormat.Appendable = apply(localUser,roList)

  def f:((models.User,List[models.Ro]) => play.twirl.api.HtmlFormat.Appendable) = (localUser,roList) => apply(localUser,roList)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 08:29:03 BST 2016
                  SOURCE: D:/roplay/ro/app/views/restricted.scala.html
                  HASH: e367ba014b89b9952202042d0f6df6fd7c7faccb
                  MATRIX: 749->1|934->50|962->103|989->105|1067->175|1106->177|1142->187|1173->192|1243->242|1293->265|1361->312|1393->317|1645->542|1663->551|1698->565|1736->577|1767->592|1806->593|1847->606|1879->611|1890->613|1919->621|1969->644|1980->646|2010->655|2051->666|2083->671|2578->1138|2607->1139|2643->1148|2708->1185|2737->1186|2778->1199|3143->1536|3172->1537|3257->1594|3286->1595|3323->1605|3352->1606|3438->1664|3467->1665|3508->1678|3610->1752|3639->1753|3684->1770|3780->1838|3809->1839|3850->1852|3978->1952|4007->1953|4052->1970|4081->1971|4124->1987|4153->1988|4250->2057|4279->2058|4320->2071|4414->2138|4443->2139|4524->2192|4553->2193|4594->2206|4689->2274|4718->2275|4777->2307|4805->2308
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|38->11|49->22|49->22|49->22|51->24|51->24|51->24|52->25|52->25|52->25|52->25|53->26|53->26|53->26|54->27|55->28|74->47|74->47|75->48|75->48|75->48|76->49|83->56|83->56|83->56|83->56|84->57|84->57|85->58|85->58|86->59|87->60|87->60|88->61|90->63|90->63|91->64|93->66|93->66|93->66|93->66|94->67|94->67|95->68|95->68|96->69|98->71|98->71|99->72|99->72|100->73|102->75|102->75|104->77|104->77
                  -- GENERATED --
              */
          
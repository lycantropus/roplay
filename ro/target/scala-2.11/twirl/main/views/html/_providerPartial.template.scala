
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
object _providerPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(skipCurrent: Boolean = true):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script type="text/javascript">
function askOpenID(url) """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
	"""),format.raw/*7.2*/("""var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
		"""),format.raw/*9.3*/("""window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</script>
<ul class="providers">
	"""),_display_(/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<li>
		"""),_display_(/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			"""),format.raw/*17.4*/("""<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(/*17.55*/p/*17.56*/.getUrl()),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			"""),format.raw/*19.4*/("""<a href=""""),_display_(/*19.14*/p/*19.15*/.getUrl()),format.raw/*19.24*/("""">
		""")))}),format.raw/*20.4*/("""
		"""),_display_(/*21.4*/_providerIcon(p.getKey())),format.raw/*21.29*/("""</a>
		</li>
	""")))}),format.raw/*23.3*/("""
"""),format.raw/*24.1*/("""</ul>"""))}
  }

  def render(skipCurrent:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(skipCurrent)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (skipCurrent) => apply(skipCurrent)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/_providerPartial.scala.html
                  HASH: 6df1ce0ab607d4bd933703a254e8edd2a16e6c2b
                  MATRIX: 735->1|895->30|925->80|953->82|1037->139|1065->140|1094->143|1209->231|1237->232|1267->236|1361->303|1389->304|1418->306|1446->307|1475->309|1538->346|1572->371|1617->378|1648->382|1683->391|1718->417|1758->419|1790->424|1868->475|1878->476|1908->485|1936->496|1949->501|1988->502|2020->507|2057->517|2067->518|2097->527|2134->534|2165->539|2211->564|2258->581|2287->583
                  LINES: 26->1|29->1|31->4|32->5|33->6|33->6|34->7|35->8|35->8|36->9|37->10|37->10|38->11|38->11|39->12|41->14|41->14|41->14|42->15|43->16|43->16|43->16|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|46->19|47->20|48->21|48->21|50->23|51->24
                  -- GENERATED --
              */
          
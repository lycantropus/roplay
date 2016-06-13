
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*7.14*/lang()/*7.20*/.code()),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>

    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="aggRo - Research Objects aggregator">
    <meta name="author" content="Lycantropus">

    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.min.js")),format.raw/*19.55*/(""""></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Application.jsRoutes),format.raw/*20.43*/("""" defer="defer"></script>

    <!-- Le styles -->
    <link href=""""),_display_(/*23.18*/routes/*23.24*/.Assets.at("css/main.css")),format.raw/*23.50*/("""" rel="stylesheet">
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.at("css/bootstrap.min.css")),format.raw/*24.59*/("""" rel="stylesheet">


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href=""""),_display_(/*44.35*/routes/*44.41*/.Application.index()),format.raw/*44.61*/("""">aggRO</a>

          <div class="btn-group pull-right">
          """),_display_(/*47.12*/subjectPresentOr()/*47.30*/ {_display_(Seq[Any](format.raw/*47.32*/("""
          	"""),_display_(/*48.13*/defining(Application.getLocalUser(session()))/*48.58*/ { user =>_display_(Seq[Any](format.raw/*48.68*/("""
            """),format.raw/*49.13*/("""<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(/*50.42*/user/*50.46*/.name),format.raw/*50.51*/("""
              """),format.raw/*51.15*/("""<span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(/*54.29*/routes/*54.35*/.Application.profile()),format.raw/*54.57*/("""">"""),_display_(/*54.60*/Messages("playauthenticate.navigation.profile")),format.raw/*54.107*/("""</a></li>
              <li><a href=""""),_display_(/*55.29*/routes/*55.35*/.Account.link()),format.raw/*55.50*/("""">"""),_display_(/*55.53*/Messages("playauthenticate.navigation.link_more")),format.raw/*55.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(/*57.29*/com/*57.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*57.93*/(""""><i class="icon-off"></i> """),_display_(/*57.121*/Messages("playauthenticate.navigation.logout")),format.raw/*57.167*/("""</a></li>
            </ul>
            """)))}),format.raw/*59.14*/("""
          """)))}/*60.12*/{_display_(Seq[Any](format.raw/*60.13*/("""
            """),format.raw/*61.13*/("""<a href=""""),_display_(/*61.23*/routes/*61.29*/.Application.login()),format.raw/*61.49*/("""" class="btn btn-primary btn-mini """),_display_(/*61.84*/("disabled".when(nav == "login"))),format.raw/*61.117*/("""">"""),_display_(/*61.120*/Messages("playauthenticate.navigation.login")),format.raw/*61.165*/("""</a>
          """)))}),format.raw/*62.12*/("""
          """),format.raw/*63.11*/("""</div>


          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(/*68.27*/("active".when(nav == ""))),format.raw/*68.53*/(""""><a href=""""),_display_(/*68.65*/routes/*68.71*/.Application.index()),format.raw/*68.91*/("""">"""),_display_(/*68.94*/Messages("playauthenticate.navigation.home")),format.raw/*68.138*/("""</a></li>
              <li class=""""),_display_(/*69.27*/("active".when(nav == "restricted"))),format.raw/*69.63*/(""""><a href=""""),_display_(/*69.75*/routes/*69.81*/.Application.restricted()),format.raw/*69.106*/("""">"""),_display_(/*69.109*/Messages("playauthenticate.navigation.restricted")),format.raw/*69.159*/("""</a></li>

                """),_display_(/*71.18*/subjectNotPresent()/*71.37*/ {_display_(Seq[Any](format.raw/*71.39*/("""
			    	"""),format.raw/*72.9*/("""<li class=""""),_display_(/*72.21*/("active".when(nav == "signup"))),format.raw/*72.53*/(""""><a href=""""),_display_(/*72.65*/routes/*72.71*/.Application.signup()),format.raw/*72.92*/("""">"""),_display_(/*72.95*/Messages("playauthenticate.navigation.signup")),format.raw/*72.141*/("""</a></li>
			    """)))}),format.raw/*73.9*/("""
            """),format.raw/*74.13*/("""</ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(/*81.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*81.54*/ {_display_(Seq[Any](format.raw/*81.56*/("""
	      """),format.raw/*82.8*/("""<div class="alert alert-error">
	      	"""),_display_(/*83.10*/flash()/*83.17*/.get(Application.FLASH_ERROR_KEY)),format.raw/*83.50*/("""
	      """),format.raw/*84.8*/("""</div>
	    """)))}),format.raw/*85.7*/("""
	    """),_display_(/*86.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*86.56*/ {_display_(Seq[Any](format.raw/*86.58*/("""
	      """),format.raw/*87.8*/("""<div class="alert alert-success">
	      	"""),_display_(/*88.10*/flash()/*88.17*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*88.52*/("""
	      """),format.raw/*89.8*/("""</div>
	    """)))}),format.raw/*90.7*/("""
		"""),_display_(/*91.4*/content),format.raw/*91.11*/("""

    """),format.raw/*93.5*/("""<hr>

      <footer>
        <p>&copy; aggRO <a href="https://github.com/lycantropus/roplay"> Link to GitHub repository</a>.</p>
        <p>
         </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 04:16:55 BST 2016
                  SOURCE: D:/roplay/ro/app/views/main.scala.html
                  HASH: 42fa287cd8dd05bc74c9b2a3c2dcf99cf4dafb63
                  MATRIX: 734->1|972->49|1002->160|1030->162|1086->192|1100->198|1127->205|1179->231|1204->236|1621->626|1636->632|1690->665|1745->693|1760->699|1802->720|1899->790|1914->796|1961->822|2026->860|2041->866|2097->901|2745->1522|2760->1528|2801->1548|2900->1620|2927->1638|2967->1640|3008->1654|3062->1699|3110->1709|3152->1723|3285->1829|3298->1833|3324->1838|3368->1854|3510->1969|3525->1975|3568->1997|3598->2000|3667->2047|3733->2086|3748->2092|3784->2107|3814->2110|3885->2159|3992->2239|4004->2242|4086->2303|4142->2331|4210->2377|4284->2420|4316->2433|4355->2434|4397->2448|4434->2458|4449->2464|4490->2484|4552->2519|4607->2552|4638->2555|4705->2600|4753->2617|4793->2629|4926->2735|4973->2761|5012->2773|5027->2779|5068->2799|5098->2802|5164->2846|5228->2883|5285->2919|5324->2931|5339->2937|5386->2962|5417->2965|5489->3015|5546->3045|5574->3064|5614->3066|5651->3076|5690->3088|5743->3120|5782->3132|5797->3138|5839->3159|5869->3162|5937->3208|5986->3227|6028->3241|6180->3367|6236->3414|6276->3416|6312->3425|6381->3467|6397->3474|6451->3507|6487->3516|6531->3530|6565->3538|6623->3587|6663->3589|6699->3598|6770->3642|6786->3649|6842->3684|6878->3693|6922->3707|6953->3712|6981->3719|7016->3727
                  LINES: 26->1|30->1|32->5|33->6|34->7|34->7|34->7|36->9|36->9|46->19|46->19|46->19|47->20|47->20|47->20|50->23|50->23|50->23|51->24|51->24|51->24|71->44|71->44|71->44|74->47|74->47|74->47|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|81->54|81->54|81->54|81->54|81->54|82->55|82->55|82->55|82->55|82->55|84->57|84->57|84->57|84->57|84->57|86->59|87->60|87->60|88->61|88->61|88->61|88->61|88->61|88->61|88->61|88->61|89->62|90->63|95->68|95->68|95->68|95->68|95->68|95->68|95->68|96->69|96->69|96->69|96->69|96->69|96->69|96->69|98->71|98->71|98->71|99->72|99->72|99->72|99->72|99->72|99->72|99->72|99->72|100->73|101->74|108->81|108->81|108->81|109->82|110->83|110->83|110->83|111->84|112->85|113->86|113->86|113->86|114->87|115->88|115->88|115->88|116->89|117->90|118->91|118->91|120->93
                  -- GENERATED --
              */
          
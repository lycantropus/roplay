
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
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">

    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.min.js")),format.raw/*19.55*/(""""></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Application.jsRoutes),format.raw/*20.43*/("""" defer="defer"></script>


    <!-- Le styles -->
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.at("css/main.css")),format.raw/*24.50*/("""" rel="stylesheet">
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.at("css/bootstrap.min.css")),format.raw/*25.59*/("""" rel="stylesheet">


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
          <a class="brand" href=""""),_display_(/*45.35*/routes/*45.41*/.Application.index()),format.raw/*45.61*/("""">Play! Authenticate</a>

          <div class="btn-group pull-right">
          """),_display_(/*48.12*/subjectPresentOr()/*48.30*/ {_display_(Seq[Any](format.raw/*48.32*/("""
          	"""),_display_(/*49.13*/defining(Application.getLocalUser(session()))/*49.58*/ { user =>_display_(Seq[Any](format.raw/*49.68*/("""
            """),format.raw/*50.13*/("""<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(/*51.42*/user/*51.46*/.name),format.raw/*51.51*/("""
              """),format.raw/*52.15*/("""<span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(/*55.29*/routes/*55.35*/.Application.profile()),format.raw/*55.57*/("""">"""),_display_(/*55.60*/Messages("playauthenticate.navigation.profile")),format.raw/*55.107*/("""</a></li>
              <li><a href=""""),_display_(/*56.29*/routes/*56.35*/.Account.link()),format.raw/*56.50*/("""">"""),_display_(/*56.53*/Messages("playauthenticate.navigation.link_more")),format.raw/*56.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(/*58.29*/com/*58.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*58.93*/(""""><i class="icon-off"></i> """),_display_(/*58.121*/Messages("playauthenticate.navigation.logout")),format.raw/*58.167*/("""</a></li>
            </ul>
            """)))}),format.raw/*60.14*/("""
          """)))}/*61.12*/{_display_(Seq[Any](format.raw/*61.13*/("""
            """),format.raw/*62.13*/("""<a href=""""),_display_(/*62.23*/routes/*62.29*/.Application.login()),format.raw/*62.49*/("""" class="btn btn-primary btn-mini """),_display_(/*62.84*/("disabled".when(nav == "login"))),format.raw/*62.117*/("""">"""),_display_(/*62.120*/Messages("playauthenticate.navigation.login")),format.raw/*62.165*/("""</a>
          """)))}),format.raw/*63.12*/("""
          """),format.raw/*64.11*/("""</div>


          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(/*69.27*/("active".when(nav == ""))),format.raw/*69.53*/(""""><a href=""""),_display_(/*69.65*/routes/*69.71*/.Application.index()),format.raw/*69.91*/("""">"""),_display_(/*69.94*/Messages("playauthenticate.navigation.home")),format.raw/*69.138*/("""</a></li>
              <li class=""""),_display_(/*70.27*/("active".when(nav == "restricted"))),format.raw/*70.63*/(""""><a href=""""),_display_(/*70.75*/routes/*70.81*/.Application.restricted()),format.raw/*70.106*/("""">"""),_display_(/*70.109*/Messages("playauthenticate.navigation.restricted")),format.raw/*70.159*/("""</a></li>

                """),_display_(/*72.18*/subjectNotPresent()/*72.37*/ {_display_(Seq[Any](format.raw/*72.39*/("""
			    	"""),format.raw/*73.9*/("""<li class=""""),_display_(/*73.21*/("active".when(nav == "signup"))),format.raw/*73.53*/(""""><a href=""""),_display_(/*73.65*/routes/*73.71*/.Application.signup()),format.raw/*73.92*/("""">"""),_display_(/*73.95*/Messages("playauthenticate.navigation.signup")),format.raw/*73.141*/("""</a></li>
			    """)))}),format.raw/*74.9*/("""
            """),format.raw/*75.13*/("""</ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(/*82.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*82.54*/ {_display_(Seq[Any](format.raw/*82.56*/("""
	      """),format.raw/*83.8*/("""<div class="alert alert-error">
	      	"""),_display_(/*84.10*/flash()/*84.17*/.get(Application.FLASH_ERROR_KEY)),format.raw/*84.50*/("""
	      """),format.raw/*85.8*/("""</div>
	    """)))}),format.raw/*86.7*/("""
	    """),_display_(/*87.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*87.56*/ {_display_(Seq[Any](format.raw/*87.58*/("""
	      """),format.raw/*88.8*/("""<div class="alert alert-success">
	      	"""),_display_(/*89.10*/flash()/*89.17*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*89.52*/("""
	      """),format.raw/*90.8*/("""</div>
	    """)))}),format.raw/*91.7*/("""
		"""),_display_(/*92.4*/content),format.raw/*92.11*/("""

    """),format.raw/*94.5*/("""<hr>

      <footer>
        <p>&copy; 2012-2014 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
        <p>
        <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
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
                  DATE: Sun Jun 12 03:17:19 BST 2016
                  SOURCE: D:/roplay/ro/app/views/main.scala.html
                  HASH: 8405cf84bbed628a9d2362f2e89064ff9232622b
                  MATRIX: 734->1|972->49|1000->156|1027->157|1082->186|1096->192|1123->199|1173->223|1198->228|1657->660|1672->666|1726->699|1780->726|1795->732|1837->753|1932->821|1947->827|1994->853|2058->890|2073->896|2129->931|2757->1532|2772->1538|2813->1558|2922->1640|2949->1658|2989->1660|3029->1673|3083->1718|3131->1728|3172->1741|3304->1846|3317->1850|3343->1855|3386->1870|3525->1982|3540->1988|3583->2010|3613->2013|3682->2060|3747->2098|3762->2104|3798->2119|3828->2122|3899->2171|4004->2249|4016->2252|4098->2313|4154->2341|4222->2387|4294->2428|4325->2440|4364->2441|4405->2454|4442->2464|4457->2470|4498->2490|4560->2525|4615->2558|4646->2561|4713->2606|4760->2622|4799->2633|4927->2734|4974->2760|5013->2772|5028->2778|5069->2798|5099->2801|5165->2845|5228->2881|5285->2917|5324->2929|5339->2935|5386->2960|5417->2963|5489->3013|5544->3041|5572->3060|5612->3062|5648->3071|5687->3083|5740->3115|5779->3127|5794->3133|5836->3154|5866->3157|5934->3203|5982->3221|6023->3234|6168->3353|6224->3400|6264->3402|6299->3410|6367->3451|6383->3458|6437->3491|6472->3499|6515->3512|6548->3519|6606->3568|6646->3570|6681->3578|6751->3621|6767->3628|6823->3663|6858->3671|6901->3684|6931->3688|6959->3695|6992->3701
                  LINES: 26->1|30->1|32->5|33->6|34->7|34->7|34->7|36->9|36->9|46->19|46->19|46->19|47->20|47->20|47->20|51->24|51->24|51->24|52->25|52->25|52->25|72->45|72->45|72->45|75->48|75->48|75->48|76->49|76->49|76->49|77->50|78->51|78->51|78->51|79->52|82->55|82->55|82->55|82->55|82->55|83->56|83->56|83->56|83->56|83->56|85->58|85->58|85->58|85->58|85->58|87->60|88->61|88->61|89->62|89->62|89->62|89->62|89->62|89->62|89->62|89->62|90->63|91->64|96->69|96->69|96->69|96->69|96->69|96->69|96->69|97->70|97->70|97->70|97->70|97->70|97->70|97->70|99->72|99->72|99->72|100->73|100->73|100->73|100->73|100->73|100->73|100->73|100->73|101->74|102->75|109->82|109->82|109->82|110->83|111->84|111->84|111->84|112->85|113->86|114->87|114->87|114->87|115->88|116->89|116->89|116->89|117->90|118->91|119->92|119->92|121->94
                  -- GENERATED --
              */
          
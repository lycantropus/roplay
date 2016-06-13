
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""

    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/Messages("playauthenticate.profile.title")),format.raw/*7.52*/("""</h1>
    <p>
    Your name is """),_display_(/*9.19*/localUser/*9.28*/.name),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""and your email address is """),_display_(/*9.61*/if(!localUser.email)/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*9.110*/else/*9.115*/{_display_(Seq[Any](format.raw/*9.116*/("""
    	"""),_display_(/*10.7*/localUser/*10.16*/.email),format.raw/*10.22*/(""".
	    <i>
	    """),_display_(/*12.7*/if(!localUser.emailValidated && localUser.email)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
	      """),format.raw/*13.8*/("""(<a href=""""),_display_(/*13.19*/routes/*13.25*/.Account.verifyEmail),format.raw/*13.45*/("""">unverified - click to verify</a>)
	    """)))}/*14.8*/else/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	      """),format.raw/*15.8*/("""(verified)
	    """)))}),format.raw/*16.7*/("""</i>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<br />
        """),_display_(/*19.10*/if(localUser.firstName && localUser.lastName)/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
            """),format.raw/*20.13*/("""Your first name is """),_display_(/*20.33*/localUser/*20.42*/.firstName),format.raw/*20.52*/(""" """),format.raw/*20.53*/("""and your last name is """),_display_(/*20.76*/localUser/*20.85*/.lastName),format.raw/*20.94*/("""
            """),format.raw/*21.13*/("""<br/>
        """)))}),format.raw/*22.10*/("""
    """),_display_(/*23.6*/defining(localUser.getProviders())/*23.40*/ { providers =>_display_(Seq[Any](format.raw/*23.55*/("""
        """),_display_(/*24.10*/if(providers.size() > 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
        """),_display_(/*25.10*/if(providers.size() ==1)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
            """),_display_(/*26.14*/Messages("playauthenticate.profile.providers_one")),format.raw/*26.64*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(/*28.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString())),format.raw/*28.93*/("""
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/for(p <- providers) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
            """),_display_(/*31.14*/_providerIcon(p)),format.raw/*31.30*/("""
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""<br/>
        """)))}),format.raw/*34.10*/("""
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<br/>
    """),_display_(/*38.6*/currentAuth()/*38.19*/ { auth =>_display_(Seq[Any](format.raw/*38.29*/("""
        """),_display_(/*39.10*/Messages("playauthenticate.profile.logged")),format.raw/*39.53*/(""" """),_display_(/*39.55*/_providerIcon(auth.getProvider())),format.raw/*39.88*/("""<br/>
        """),_display_(/*40.10*/if(auth.expires() != -1)/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
            """),_display_(/*41.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires()))),format.raw/*41.117*/("""
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(/*43.14*/Messages("playauthenticate.profile.session_endless", auth.getId())),format.raw/*43.80*/("""
        """)))}),format.raw/*44.10*/("""
    """)))}),format.raw/*45.6*/("""
    """),format.raw/*46.5*/("""<br/>
    <ul>
    	<li><a href=""""),_display_(/*48.20*/routes/*48.26*/.Account.changePassword),format.raw/*48.49*/("""">"""),_display_(/*48.52*/Messages("playauthenticate.profile.password_change")),format.raw/*48.104*/("""</a></li>
    </ul>
    </p>
""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/profile.scala.html
                  HASH: 5b1eda6677d7367cce6c86f0f914443411ac4545
                  MATRIX: 730->1|892->32|922->82|950->85|1016->143|1055->145|1089->153|1120->158|1182->200|1242->234|1259->243|1284->248|1312->249|1365->276|1393->296|1432->298|1477->325|1490->330|1529->331|1563->339|1581->348|1608->354|1653->373|1710->421|1750->423|1786->432|1824->443|1839->449|1880->469|1941->513|1954->518|1993->519|2029->528|2077->546|2118->557|2151->563|2195->580|2249->625|2289->627|2331->641|2378->661|2396->670|2427->680|2456->681|2506->704|2524->713|2554->722|2596->736|2643->752|2676->759|2719->793|2772->808|2810->819|2843->843|2883->845|2921->856|2954->880|2994->882|3036->897|3107->947|3137->959|3150->964|3189->965|3231->980|3331->1059|3373->1070|3411->1081|3446->1100|3486->1102|3528->1117|3565->1133|3607->1144|3644->1154|3691->1170|3728->1177|3763->1185|3801->1197|3823->1210|3871->1220|3909->1231|3973->1274|4002->1276|4056->1309|4099->1325|4132->1349|4171->1350|4213->1365|4338->1468|4368->1480|4381->1485|4420->1486|4462->1501|4549->1567|4591->1578|4628->1585|4661->1591|4724->1627|4739->1633|4783->1656|4813->1659|4887->1711|4950->1744
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|40->13|40->13|40->13|40->13|41->14|41->14|41->14|42->15|43->16|44->17|45->18|46->19|46->19|46->19|47->20|47->20|47->20|47->20|47->20|47->20|47->20|47->20|48->21|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|54->27|54->27|54->27|55->28|55->28|56->29|57->30|57->30|57->30|58->31|58->31|59->32|60->33|61->34|62->35|64->37|65->38|65->38|65->38|66->39|66->39|66->39|66->39|67->40|67->40|67->40|68->41|68->41|69->42|69->42|69->42|70->43|70->43|71->44|72->45|73->46|75->48|75->48|75->48|75->48|75->48|78->51
                  -- GENERATED --
              */
          
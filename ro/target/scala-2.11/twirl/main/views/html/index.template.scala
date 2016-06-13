
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1 id="logo">"""),_display_(/*5.24*/Messages("playauthenticate.index.intro")),format.raw/*5.64*/("""</h1>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div id="firstfeat" class="span4">
          <h2>"""),_display_(/*11.16*/Messages("playauthenticate.index.heading")),format.raw/*11.58*/("""</h2>
           <p>Be the author of your own research objects and add them to your collection! You will also be able to see a list of them.</p>
        </div>
        <div  id="secondfeat" class="span4">
          <h2>Search for artifacts</h2>
           <p>Whenever you need an artifact, our search tool enables you to easily search for it.</p>
       </div>
        <div  id="thirdfeat" class="span4">
          <h2>Update your work</h2>
          <p>Add new artifacts into your research objects, update the old ones or simply remove them if you ever feel the need to.</p>
        </div>
      </div>
    """)))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 13 04:16:55 BST 2016
                  SOURCE: D:/roplay/ro/app/views/index.scala.html
                  HASH: 54710c929a195f98ea086816d8fd77efe778721b
                  MATRIX: 798->3|852->49|891->51|925->59|1080->188|1140->228|1313->374|1376->416
                  LINES: 29->2|29->2|29->2|30->3|32->5|32->5|38->11|38->11
                  -- GENERATED --
              */
          
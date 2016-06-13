
package views.txt.account.signup.email

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
import views.txt._

/**/
object verify_email_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Hola """),_display_(/*1.77*/name),format.raw/*1.81*/(""",


Se acaba de apuntar a PlayAuthenticate.

Siga el siguiente enlace para activar su cuenta:
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Saludos,
El equipo de PlayAuthenticate.
"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:01 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/signup/email/verify_email_es.scala.txt
                  HASH: 0a4f82e7da14c0690baf341f90cb2097d8666bc9
                  MATRIX: 769->1|925->70|957->76|981->80|1107->181|1142->196|1172->200
                  LINES: 26->1|29->1|29->1|29->1|35->7|35->7|37->9
                  -- GENERATED --
              */
          
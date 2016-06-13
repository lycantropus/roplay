
package views.txt.account.email

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
object verify_email_de extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(/*1.76*/name),format.raw/*1.80*/(""", 


um deine E-Mail-Adresse zu bestätigen, folge einfach diesem Link:

"""),_display_(/*6.2*/verificationUrl),format.raw/*6.17*/("""

"""),format.raw/*8.1*/("""Grüße,
Das PlayAuthenticate-Team"""))}
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 22:41:00 BST 2016
                  SOURCE: C:/Users/Pedro/Documents/GitHub/roplay/ro/app/views/account/email/verify_email_de.scala.txt
                  HASH: b4127f45225224eca2ee643057c5bc78a8c783c2
                  MATRIX: 762->1|918->70|949->75|973->79|1076->157|1111->172|1141->176
                  LINES: 26->1|29->1|29->1|29->1|34->6|34->6|36->8
                  -- GENERATED --
              */
          
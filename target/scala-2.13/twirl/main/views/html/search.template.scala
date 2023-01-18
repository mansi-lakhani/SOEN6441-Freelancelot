
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ownerID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en">

    <head>
        <title>Search Result</title>
    </head>

    <body>
        <h1>"""),_display_(/*10.14*/ownerID),format.raw/*10.21*/("""</h1>
    </body>

</html>"""))
      }
    }
  }

  def render(ownerID:String): play.twirl.api.HtmlFormat.Appendable = apply(ownerID)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (ownerID) => apply(ownerID)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/search.scala.html
                  HASH: 5a95af195152ef4785a2cb68103ad9a00132a308
                  MATRIX: 908->1|1019->19|1046->20|1176->123|1204->130
                  LINES: 27->1|32->2|33->3|40->10|40->10
                  -- GENERATED --
              */
          
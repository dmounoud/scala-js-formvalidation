package ch.diadys.formvalidation

import scala.scalajs.js
import org.scalajs.jquery.JQuery
import org.scalajs.jquery.JQueryEventObject

@js.native
trait FormValidation extends JQuery {
  
  def formValidation(): FormValidation = js.native
  def formValidation(options: js.Dynamic): FormValidation = js.native
  def formValidation(methodName: String, parameters: js.Dynamic): FormValidation = js.native
  
  def on(events: String, selector: js.Any, data: js.Any, handler: js.Function2[JQueryEventObject, js.Dynamic, js.Any]): JQuery = js.native
  def on(events: String, selector: js.Any, handler: js.Function2[JQueryEventObject, js.Dynamic, js.Any]): JQuery = js.native
  def on(events: String, handler: js.Function2[JQueryEventObject, js.Dynamic, js.Any]): JQuery = js.native
  
  def revalidateField(fieldName: String): Unit = js.native
  def getFieldElements(fieldName: String): JQuery = js.native
  def isValidField(fieldName: String): Boolean = js.native
  def getMessages(field: String): String[] = js.native
  def getMessages(field: JQuery): String[] = js.native
  def getMessages(field: String, validator: FormValidation): String[] = js.native
  def getMessages(field: JQuery, validator: FormValidation): String[] = js.native
  
}

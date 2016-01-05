package ch.diadys.formvalidation

import org.scalajs.jquery.JQuery

package object formvalidation {
  implicit def jq2fv(jq: JQuery): FormValidation = jq.asInstanceOf[FormValidation]
}

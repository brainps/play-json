/*
 * Copyright (C) 2009-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.api.libs.json

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

final class MacroScala3Spec
    extends AnyWordSpec
    with Matchers
    with org.scalatestplus.scalacheck.ScalaCheckPropertyChecks {
  "Case class" should {
    "not be handled" when {
      "no Product Conversion" in {
        import MacroSpec.UsingAlias

        "Json.writes[UsingAlias]".mustNot(typeCheck)
      }

      "no custom ProductOf" in {
        "Json.writes[CustomNoProductOf]".mustNot(typeCheck)
      }
    }

    "be handled" when {
      "is declared with more than 22 fields" in {
        val format = Json.format[BigFat]

        format.writes(BigFat.example).mustEqual(Json.obj())
      }
    }
  }
}

final class CustomNoProductOf(val name: String, val age: Int)

object CustomNoProductOf {

  given Conversion[CustomNoProductOf, Tuple2[String, Int]] =
    (v: CustomNoProductOf) => v.name -> v.age
}

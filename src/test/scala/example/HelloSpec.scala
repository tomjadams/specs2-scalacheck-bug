package example

import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

final class HelloSpec extends Specification with ScalaCheck {
  val prop: Properties = new Properties("Hello") {
    property("greetings") = forAll(Gen.alphaStr) { (greeting: String) =>
      Hello(greeting).greeting must beEqualTo("this should fail!")
    }
  }

  s2"Hello checks - should fail and does ${properties(prop)}"
  s2"Hello checks - should fail and does not $prop"
}

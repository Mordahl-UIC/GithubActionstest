package edu.uic

import munit.{FunSuite, ScalaCheckSuite}
// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends FunSuite:
  val macOsSpecific = munit.Tag("macos")
  test("Basic math"):
    assert(1 + 1 == 2)

  test("Only run on MacOS".tag(macOsSpecific)):
    assert(System.getProperty("os.name").toLowerCase.contains("linux"))
end MySuite

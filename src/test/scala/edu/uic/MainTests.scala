package edu.uic

import munit.{FunSuite, ScalaCheckSuite}
// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends FunSuite:
  test("Basic math"):
    assert(1 + 1 == 2)
end MySuite

package com.techmonad.learning.finch

import io.finch._
import org.scalatest.funsuite.AnyFunSuite

class MainTest extends AnyFunSuite {
  test("healthcheck") {
    assert(Main.healthcheck(Input.get("/")).awaitValueUnsafe() == Some("OK"))
  }

  test("helloWorld") {
    assert(Main.helloWorld(Input.get("/hello")).awaitValueUnsafe() == Some(Main.Message("World")))
  }

  test("hello") {
    assert(Main.hello(Input.get("/hello/foo")).awaitValueUnsafe() == Some(Main.Message("foo")))
  }
}
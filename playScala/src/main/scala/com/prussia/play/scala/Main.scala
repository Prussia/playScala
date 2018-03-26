package com.prussia.play.scala

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"********************************")
  println(s"The oldest person is ${ages.max}")
  println(s"The youngest person is ${ages.min}")
  println(s"********************************")
}

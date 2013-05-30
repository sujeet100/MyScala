package com.my.scala.traits

trait Flying {

  def flyMessage:String
  
  def fly()={
    println(flyMessage)
  }
}
package com.my.scala.shape

/**
 * This class extends rectangle class which is a Java class.
 * Scala allows this
 * We have overriden the method area 
 */
class Square(a:Int) extends Rectangle {

  var side=a
  
 override def area:Int={
    return a*a;
  }
  
  
}
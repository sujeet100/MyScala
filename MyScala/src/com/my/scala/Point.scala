package com.my.scala

class Point(xPosi:Int,yPosi:Int) {

  var x=xPosi;
  var y=yPosi;
  
   override def toString:String={// to override a method override keyword is used before def keyword and is mandatory
    return "XPosi: "+xPosi+" && Yposi: "+yPosi;
  }
  
}
package com.my.scala

class Point(xPosi:Int,yPosi:Int) {

  var x=xPosi;
  var y=yPosi;
  
   override def toString:String={
    return "XPosi: "+xPosi+" && Yposi: "+yPosi;
  }
  
}
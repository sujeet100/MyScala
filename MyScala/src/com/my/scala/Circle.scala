package com.my.scala


class Circle(rad:Float) {

  val radius=rad
  
  def area()  = 3.14*radius*radius;
  
  def perimeter= 2*3.14*radius
  
  var diameter=2*radius
  
  var pointsOnCircle:Array[Point]=Array(new Point(2,3),new Point(4,5))
  
  def showPointsOnCircle={
    for(point<-pointsOnCircle){
      println(point);
    }
  }
}


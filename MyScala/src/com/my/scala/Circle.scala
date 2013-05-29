package com.my.scala


class Circle(rad:Float) extends Shape {

  val radius=rad //val means constant
  
  def area()  = 3.14*radius*radius; //def is used to define a method
  
  def perimeter= 2*3.14*radius //Parameters can be omitted if there are no parameters.
  
  var diameter=2*radius //var means a member variable which can be modifed
  
  var pointsOnCircle:Array[Point]=Array(new Point(2,3),new Point(4,5))
  
  def addPointInArray(point:Point)={ //this method takes one parameter of type Point
   pointsOnCircle:+=point	//this will append the point objects at the end in the array. +:= will append it in the beginning
  }
  
  
  def showPointsOnCircle={
    for(point<-pointsOnCircle){	//this is aniterator style loop
      println(point); // toString methos is overridden in Point class which allows us to print the point co-ordinates
    }
  }
}


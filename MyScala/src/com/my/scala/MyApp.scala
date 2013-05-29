package com.my.scala

/**
 * Object means a singleton class i.e. only one instance of this class can be created.
 * The main method of the application is written in Object  
 * 
 * A good introduction to scala: http://ofps.oreilly.com/titles/9780596155957/
 * 
 */
object MyApp {

  def main(args: Array[String]) {
    
    val circle = new Circle(2.5f) //create a new circle class object with 2.5 as rad
    
    println(circle perimeter) //calls perimeter method in circle class
    /*Following syntax are also allowed
    circle.perimeter
    
     following syntax can be used if you define method in Circle class as 
     	def perimeter()={			i.e. with perenthesis
    circle.perimeter()
    circle perimeter() 

     */
    
    println(circle area)

    println(circle diameter)

    circle addPointInArray new Point(8,9)	//circle.addPointInArray(new Point(8,9)) is also permitted
    //circle addPointInArray(new Point(8,9)) is also permitted
    
    circle showPointsOnCircle
  }

}
package com.my.scala.traits

object TestBirds {

  def main(args: Array[String]) {

    var flyingBirds = List(new Hawk, new Pigeon)

    for(bird<-flyingBirds){
      bird.fly;
    }
    
    
    var swimmingBird=List(new Penguin, new Pigeon)
    
    for(bird<-swimmingBird){
      bird.swim;
      
    }
    
    
    var myBird=new Hawk with Swimming
    	
    	myBird.fly
    	myBird.swim
    
  }
}
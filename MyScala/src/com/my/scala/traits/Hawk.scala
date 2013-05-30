package com.my.scala.traits

class Hawk extends Bird with Flying{

  val flyMessage="I am an excellent flyer"
  
}



class Pigeon extends Bird with Flying with Swimming{
  val flyMessage="I am a good flyer"
    
}


class Penguin extends Bird with Swimming{
  
}


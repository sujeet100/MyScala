package com.my.scala

object ScalaMap {

  def main(args: Array[String]) {

    var color = Map(
      "Sky" -> "blue",
      "Mango" -> "Yellow")

      //key value can be added in following ways
    color += Pair("Grass", "Green")
    color += Tuple2("Rose", "Red")
    color += "Snow" -> "White"

    //Value from map is accessed as follow
    
    println("Sky is: " + color("Sky"))
    println("Grass is: " + color("Grass"))
    println("Rose is: " + color("Rose"))
    println("Snow is: " + color("Snow"))
  }

}
package com.my.scala

object ScalaIf {

  def main(args:Array[String])={
    var a=10;
    var b=0;
    
    var c=if(b==0){//if returns a value in scala. Here it returns 0 if denom is 0. Else it performs division
      //This avoid the need to ternary conditional expression
      0
    }else{
      a/b;
    }
    print("divisin is: "+ c)
  }  
}
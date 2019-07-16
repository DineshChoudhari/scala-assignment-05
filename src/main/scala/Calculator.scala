class Calculator {
def calAddition(num1:Int,num2:Int): Int ={
  num1+num2
}
  def calSubstract(num1:Int,num2:Int):Int={
  num1-num2
  }
  def calMultiply(num1:Int,num2:Int):Int={
    num1*num2
  }
  def calDivison(num1:Int,num2:Int):Unit= {
    try {
      num1/num2

    }
    catch{
      case e:ArithmeticException=>println(e)
    }
        println("Rest of the code is executing")
  }
}
object Cal
{
  def main(args: Array[String]): Unit = {
    var cal1=new Calculator
    println(cal1.calAddition(5,4))
    println(cal1.calDivison(2,0))
    println(cal1.calSubstract(5,3))
    println(cal1.calMultiply(2,3))
  }
}

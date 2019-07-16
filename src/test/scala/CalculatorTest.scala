import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {
  var cal=new Calculator()
  test("Calculator.calAddition") {
    assert(cal.calAddition(2, 5) == 7)
  }
    test("Calculator.calSubstract"){
      assert(cal.calSubstract(5,3)==2)
    }
    test("Calculator.calMultiply"){
      assert(cal.calMultiply(3,5)==15)
    }
    test("Calculator.calDivison"){
      assert(cal.calDivison(2,0)==0)

    }
    test("Calculator.calDivision"){
      assert(cal.calDivison(6,3)==2)
    }

}

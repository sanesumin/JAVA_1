package day0601.calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:"+ result1);
		
		byte a =10;
		byte b = 4;
		double result2 = myCalc.divide(a, b);
		System.out.println("result2:"+ result2);
		
		myCalc.poweroff();
		
	}

}

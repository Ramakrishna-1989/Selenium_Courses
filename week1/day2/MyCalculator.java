package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		System.out.println("Addition of Numbers :" +cal.add(10, 30, 60));
		System.out.println("Subtraction of Numbers :" +cal.sub(276, 87));
		System.out.println("Multiplication of Numbers :" +cal.mul(44, 90));
		System.out.println("division of Numbers :" +cal.divide(10.0f, 5.0f));

		
		
	}

}

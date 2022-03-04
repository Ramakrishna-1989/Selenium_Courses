package week1.day2;

public class ConvertNegativeNumberToPositiveNumber {

	public static void main(String[] args) {

		int number = -40;
		int posno = 0;
		
		if(number<0) {
			posno=number*-1;
			System.out.println("The Number "+number+" is converted into "+posno);
		}else {
			System.out.println("The Number "+number+" is Positive number");
		}
	}

}

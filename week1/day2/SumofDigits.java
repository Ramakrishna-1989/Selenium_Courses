package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {

		int number=876;
		int sum=0;
		
		while(number>0) 
		{
			
			int rem = number % 10;
			number = number/10;
			sum=sum+rem;
		}
	
		System.out.println("The Sum of digits: " +sum);
	
	}

}

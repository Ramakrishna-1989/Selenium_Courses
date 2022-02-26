package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 17;
		boolean a = false;
		
		for(int i=2 ; i<=input/2 ; i++) {
			
			if(input % i == 0) {
				
				a = true;
				break;
			}
		}
		 if (a == false) {
			 System.out.println("The given number is:"+input+"prime number");
		 
		 }
		 
		 else
		 {
			 System.out.println("The given number is:"+input+"Not a prime number");
		 }
		
	}

}

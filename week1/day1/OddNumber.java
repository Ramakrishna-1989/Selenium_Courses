package week1.day1;

public class OddNumber {

	public static void main(String[] args) {

		System.out.println("Priting Odd numbers from 1 to 20");
		
		int num =20;
		for(int i=1; i<=num; i++) {
			if(i%2!=0) {
				System.out.println("The odd number is: "+i);
			}
		}
	}

}

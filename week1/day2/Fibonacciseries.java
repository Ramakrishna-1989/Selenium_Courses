package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {

		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		System.out.print(firstNum+" ");
		System.out.print(" "+secNum+" ");
		
		
		for(int i=2; i <= range-1 ; i++) {
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
			System.out.print(" "+sum+" ");
			
			
			
			
		}
	
	
	}

}

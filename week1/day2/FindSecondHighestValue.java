package week1.day2;

import java.util.Arrays;

public class FindSecondHighestValue {

	public static void main(String[] args) {

		int[] arr = {10,20,30,60,25,70,100,36,80};
		
		Arrays.sort(arr);
		
		
		int indexofsecondhighest = arr.length-2;
		System.out.println(arr[indexofsecondhighest]);
		
	}

}

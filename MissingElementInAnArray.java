package week2.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		//System.out.println(sum1);

		int sum2 = 0;
		for (int i = 1; i <= 8; i++) {
			sum2=sum2+i;
		}
		//System.out.println(sum2);
		System.out.println("Missing no in an array is " + (sum2-sum1));
	}

}

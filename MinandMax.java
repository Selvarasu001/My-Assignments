package week2.day2;

import java.util.Arrays;

public class MinandMax {

	public static void main(String[] args) {

  int[] var = {89,98,90,87,73};
  
  Arrays.sort(var);
  System.out.println("Min value of Array is " + var[0]);
  
  System.out.println("Max value of Array is " + var[var.length-1]);
  
  
	}

}

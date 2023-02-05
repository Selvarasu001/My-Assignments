package week1.day2;

public class IsPrime {
	public static void main(String[] args) {

		int n = 3;
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Give number is NOT Prime");
		} else
			System.out.println("Given Number is Prime");
	}

}

package week1.day2;

public class Fibbinocci {
	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;
		int thirdNum = 0;

		for (int i = 0; i < 11; i++) {

			System.out.print(firstNum + " ");
			thirdNum = firstNum + secNum;
			firstNum = secNum;
			secNum = thirdNum;

		}

	}

}

package week1.day2;

public class Car {

	public static void main(String[] args) {

		Car var = new Car();

		int regNumber = var.getRegNumber();
		System.out.println(regNumber);

		String name = var.ownerName();
		System.out.println(name);

		var.carModel();
		
		boolean punc = var.isPunctured();
		System.out.println(punc);

		int difference = var.sub(10, 6);
		System.out.println(difference);

		int multiple = var.mul(2, 3, 4);
		System.out.println(multiple);

		double division = var.div(24, 6);
		System.out.println(division);
	}

	public int getRegNumber() {
		return 1234;
	}

	private String ownerName() {
		return "Selva";
	}

	void carModel() {
		System.out.println("Swift");
	}

	public boolean isPunctured() {
		return true;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int a, int b, int c) {
		return a * b * c;
	}

	public int div(int x, int y) {
		return x / y;
	}

}

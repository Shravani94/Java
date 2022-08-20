package cj4programs;

public class trowkeyword {
	public static void main(String[] args) {
		trowkeyword t = new trowkeyword();
		t.eligible(15);
	}

	public void eligible(int age) {
		if (age < 18) {
			throw new ArithmeticException("your not eligible");
		} else {
			System.out.println("your eligible");
		}
	}

}

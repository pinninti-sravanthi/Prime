
public class Overloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(12, 13));
		System.out.println(Adder.add(12, 13, 14));
	}
}

class Adder {
	static int num1, num2, num3, num4;

	static int add(int num1, int num2) {

		return num1 + num2;
	}

	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

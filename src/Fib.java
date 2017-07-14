
public class Fib {
	public static void main(String[] args) {
		// int n;
		// System.out.println("enter number");
		// Scanner s=new Scanner(System.in);
		// count=s.nextInt();
		// s.close();
		int result = task(3).length();
		String expected = "011";
		test(result, expected);
	}

	private static void test(int r, String e) {
		if (r == Integer.parseInt(e))
			System.out.println("test pass.");
		else
			System.out.println("fail");

	}

	public static String task(int r)

	{
		String e = "011";
		if (r == 0) {
			System.out.println(r);

		} else if (r < 0) {
			System.out.println("error, we cant have negative numbers");
		} else {
			int n1 = 0, n2 = 1, i, n3;

			System.out.print(n1);

			System.out.print(n2);
			for (i = 2; i < r; ++i) {

				n3 = n1 + n2;

				System.out.print(n3);
				e = Integer.toString(n3);
				n1 = n2;
				n2 = n3;

			}

		}
		return e;

	}
}
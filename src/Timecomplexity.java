
public class Timecomplexity {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		forloopperformance();
		System.out.println("Time taken by forloop: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		whileloopperformance();
		System.out.println("Time taken by while loop: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		dowhileloopperformance();
		System.out.println("Time taken by dowhile loop: " + (System.currentTimeMillis() - startTime) + "ms");

	}

	private static String dowhileloopperformance() {
		String t = "chennai";
		int i=0;
		do {
			t = t + "is in tamilnadu";
			i++;
		} while (i < 10000);
		return t;

	}

	private static String whileloopperformance() {
int i=0;
		String t = "chennai";
		while (i < 10000) {
			t = t + "is in tamilnadu";
			i++;
		}
		return t;
	}

	private static String forloopperformance() {
		String t = "chennai";
		for (int i = 0; i < 10000; i++) {
			t = t + "is in tamilnadu";
		}
		return t;
	}
}

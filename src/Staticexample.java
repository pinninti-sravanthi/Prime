
public class Staticexample {
	static {
//		 final int a=10;
		System.out.println("welcome");//static block
	}
	public static void main(String[] args) {
		Student1.change();
		Student1 s1 = new Student1(123, "abc");
		s1.display();
	}

}

class Student1 {
	int id;
	String str;
	static String str1 = "hello";// static variable

	Student1(int i, String s) {
		id = i;
		str = s;
	}

	void display() {

		System.out.println(id + "" + str + "" + str1);
	}

	static void change() {// static method
		str1 = "helloworld";
	}

}

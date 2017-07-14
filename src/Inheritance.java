
class Parent {
	String name = "parentclass";
}

public class Inheritance extends Parent {
	String name2 = "childclass";

	public static void main(String[] args) {
		Inheritance i = new Inheritance();

		System.out.println("this is " + i.name2);
		System.out.println("this is " + i.name);
	}
}

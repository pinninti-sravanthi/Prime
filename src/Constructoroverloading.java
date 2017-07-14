
public class Constructoroverloading {
	public static void main(String[] args) {
		Student obj1 = new Student(123, "hgj");
		Student obj2 = new Student(321, "abc", "hello");
		obj1.display();
		obj2.display();
	}
}

class Student {
	int id;
	String name;
	String msg;

	Student(int i, String n) {
		id = i;
		name = n;

	}

	Student(int i, String n, String m) {
		id = i;
		name = n;
		msg = m;
	}

	void display() {
		System.out.println(id + "" + name + "" + msg);
	}

}

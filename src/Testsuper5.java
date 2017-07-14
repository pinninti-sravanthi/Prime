
public class Testsuper5 {
	public static void main(String[] args) {
		Employee1 obj1 = new Employee1(123, "sravanthi", 200000);
		obj1.display();
	}
}

class Company {
	int obj2;
	String obj3;
	float obj4;

	Company(int obj2, String obj3) {
		this.obj2 = obj2;
		this.obj3 = obj3;
	}

}

class Employee1 extends Company {
	Employee1(int obj2, String obj3, float obj4) {
		super(obj2, obj3);//reusing objects of parent class
		this.obj4 = obj4;
	}

	void display() {
		System.out.println(obj2 + "" + obj3 + "" + obj4);
	}
}
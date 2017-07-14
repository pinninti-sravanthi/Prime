
public class Employee {
	int id;
	String name;
	double salary;

	public static void main(String[] args) {

		Employee e = new Employee();
		e.push(1, "sravanthi", 20000.00);
		e.display();
	}

	private void display() {
		// TODO Auto-generated method stub

		System.out.println(id + " " + name + " " + salary);
	}

	private void push(int i, String s, double d) {

		id = i;
		name = s;
		salary = d;// TODO Auto-generated method stub

	}
}

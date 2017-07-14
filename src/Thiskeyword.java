
public class Thiskeyword {
	int a, b,c;
	float f;

	public static void main(String[] args) {
		Thiskeyword t1 = new Thiskeyword(12,12.2f);
		Thiskeyword t = new Thiskeyword(12, 13);
		//Thiskeyword obj=new Thiskeyword();
		t.display();
		t.add();
		t1.display();
	}

	Thiskeyword() {
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}

	Thiskeyword(int a, int b) {
		this();//calling default constructor from parameterized constructor
		this.a = a;
		this.b = b;//this variable
	}
	Thiskeyword(int a,float f) {
		
//		this(a);//calling default constructor from parameterized constructor
		this.f = f;//this variable
	}
	void display() {
		System.out.println(a + "" + b+""+f);

	}

	void add() {
		this.sub();// sub();//this method
		System.out.println("added successfully");
	}

	void sub() {
		System.out.println("subtracted successfully");
	}
}

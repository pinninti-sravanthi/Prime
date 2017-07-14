
class Rbi {
	void show() {
		System.out.println("RBI");
	}
}

class Icici1 extends Rbi {
	
	void show() {// overriding show()
		System.out.println("ICICI");
	}
}

class Hdfc extends Rbi {

	void show() {// overriding show()
		System.out.println("HDFC");
	}
}

class Dispatch {
	public static void main(String args[]) {

		Rbi obj1 = new Rbi();// object of type Rbi

		Icici1 obj2 = new Icici1();// object of type Icici1

		Hdfc obj3 = new Hdfc();// object of type Hdfc

		
		Rbi ref = obj1;// ref refers to an Rbi object//upcasting

		
		ref.show();// calling RBI's version of show()

		
		ref = obj2;// now ref refers to a Icici object

		
		ref.show();// calling Icici's version of show()

		
		ref = obj3;// now ref refers to a hdfc object

		
		ref.show();// calling hdfc's version of show()
	}
}

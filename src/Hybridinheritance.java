class Bike {
	void details() {
		System.out.println("details of bike");
	}
}

class Honda extends Bike {
	void cost() {
		System.out.println("cost is 20,000");
	}
}

class Splender extends Bike {
	void speed() {
		System.out.println("speed of Splender Bike is 20 kmph");
	}

}

public class Hybridinheritance{
	public static void main(String[] args) {
		Splender s = new Splender();
		s.details();
		s.speed();
		
		// s.cost();

	}
}

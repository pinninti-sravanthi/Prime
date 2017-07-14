
class Schoolfee {
	int getfee() {
		return 0;
	}
}

class School1 extends Methodoverriding {

	int getfee() {
		return 10000;
	}
}

class School2 extends Methodoverriding {
	int getfee() {
		return 20000;

	}
}

class School3 extends Methodoverriding {
	int getfee() {
		return 30000;

	}
}

public class Methodoverriding {
	public static void main(String[] args) {
		School1 obj1 = new School1();
		School2 obj2 = new School2();
		School3 obj3 = new School3();
		System.out.println(obj1.getfee());
		System.out.println(obj2.getfee());
		System.out.println(obj3.getfee());

	}
}
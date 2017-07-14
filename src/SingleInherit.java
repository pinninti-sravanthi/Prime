class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {// single inheritance
	void bark() {
		System.out.println("barking");
	}
}

class Cat extends Dog {//multilevel inheritance
	void silent() {
		System.out.println("silence");
	}
}

public class SingleInherit {
	public static void main(String[] args) {
		// Dog d = new Dog();
		// d.bark();
		// d.eat();
		Cat c = new Cat();
		c.bark();
		c.eat();
		c.silent();

	}
}



class parentclass {
	void run() {
		System.out.println("this is parent class");
	}
}
class Childclass extends parentclass{
	
	void run()
	{
		//super.run();//super method
		System.out.println("this is child class");
	super.run();
	}
	
	}


public class Superkeyword {
	
public static void main(String[] args) {
	
	Childclass obj2=new Childclass();
	obj2.run();
}
}

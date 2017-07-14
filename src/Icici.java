class Bank {
	Bank() {
		System.out.println("This is a bank");
	}
}

class Icici extends Bank {
	static String obj;
	Icici() {
		super();
		System.out.println("this is ICICI bank");
	}
	//{String obj="taramani";}

	Icici(String obj)
	{
		
		System.out.println("this is icic bank of "+obj+" branch");
	}


{
	System.out.println("this is an instance initalizer block");
}

	public static void main(String[] args) {
		 new Icici();
		new Icici("taramani");
	}
}

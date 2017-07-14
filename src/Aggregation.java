 
public class Aggregation {
int id;
	String name,city;
	Address address;

	Aggregation(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}

	void display() {
		System.out.println(id + "" + name);
		System.out.println(address.city + "" + address.state + "" + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("warangal", " telangana ", "india");
		Address address2 = new Address("taramani" , " tamilnadu " , "india");
		Aggregation a = new Aggregation(123, "sravs", address1);
		Aggregation b = new Aggregation(124, "sravs", address2);
		a.display();
		b.display();
	}
}

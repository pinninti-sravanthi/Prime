
public class Atmoperation {
public static void main(String[] args) {
	Atm a=new Atm(),a1=new Atm();
	a.insert(123,"Sravanthi",20000.00);
	a.display();
	a.checkBalance();
	a.withDraw(10000);
	a.checkBalance();
	a.deposit(30000);
	a.checkBalance();
	a1.insert(456,"sri",25000.00);
	a1.display();
	a1.checkBalance();
	a1.withDraw(20000);
	a1.checkBalance();
	a1.deposit(50000);
	a1.checkBalance();
	
}
}
class Atm
{
	int accno;
	String name;
	double balance;
	void insert(int a,String s,double b)
	{
		accno=a;
		name=s;
		balance=b;
	}
	void display()
	{
		System.out.println(accno+""+name+""+balance);
	}
	void checkBalance()
	{
		System.out.println("balance is :"+balance);
	}
	void withDraw(double d) {
		
		balance=balance-d;
		System.out.println("withdrawal amount 20,000 from account . Remaining balance is: :"+balance);
		
	}
	void deposit(double e) {
		balance=balance+e;
		System.out.println(" deposited 50000 into account.Remaining balance is:"+balance);
	}
	
}
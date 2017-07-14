
public class Variable {
  

	int data=50;//instance variable  
	static int m=100;//static variable  
	void method(){  
	int n=90;//local variable 
	System.out.println(n);
	}
	public static void main(String[] args) {
		//int n=90;//local variable
		System.out.println(m);
		//System.out.println(data);
		Variable v=new Variable();
				v.method();
		//System.out.println(n);
	}
}

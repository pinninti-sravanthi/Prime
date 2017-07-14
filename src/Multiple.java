
public class Multiple {
	
public static void main(String[] args) {
	Multiple1 m1=new  Multiple1(),m2=new Multiple1();
	m1.rectangle(20,30);
m2.rectangle(10,20);
	m1.calculate();
	m2.calculate();
}
	
}
class Multiple1{
	int length,breadth;
void rectangle(int l,int b)
{
	length=l;
	breadth=b;
	
}
void calculate()
{
	System.out.println("area is" + length*breadth);
}
}



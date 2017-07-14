public class Finalexample extends Square1 {
	 int side;

	public static void main(String[] args) {
		new Finalexample().area(4);//inheritance by using final keyword
		System.out.println();
	}
}
	class Square1{
final void area(int side)
	{
	
		System.out.println(4*side);
	}
}

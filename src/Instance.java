class Examp{
	static void run(Examp obj3)
	{
		//if(obj3 instanceof Instance)
		//{
			Examp d=(Examp)obj3;
			System.out.println("true");
		//}
	}
}
public class Instance extends Examp{
public static void main(String[] args) {
	Instance obj=new Instance();
	Instance obj2=null;
	System.out.println(obj2 instanceof Instance);//false
	System.out.println(obj instanceof Instance );//true
	System.out.println(obj instanceof Examp);//true
	Examp obj3=new Instance();
	Examp.run(obj3);
}
}

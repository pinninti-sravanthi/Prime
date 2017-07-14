
public class Palin {
public static void main(String[] args) {
	new Palin().fact(5);//Anonymous object
}
void fact(int n)
{
	int fact=1;
	while(n>0) {
		fact=fact * n;
		n--;
	}
	System.out.println(fact);
	
}
}

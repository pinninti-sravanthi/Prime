
public class Ope {
	public static void main(String args[]){  
		int x=10;  
		int a=10;  
		int b=-10;  
		int b1=5;  
		int c=20;  
		//Unary operator example
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)
		//Arithmetic example
		System.out.println(10*10/5+3-1*4/2); //21
		//shift operator
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  //5
	    System.out.println(20>>>2); //5
	  //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    
	   //logical and and bitwise and
	    System.out.println(a<b1&&a<c);//false && true = false  
	    System.out.println(a<b1&a<c);//false & true = false  
	    System.out.println(a<b1&&a++<c);//false && true = false  
	    System.out.println(a);//10 because second condition is not checked  
	    System.out.println(a<b1&a++<c);//false && true = false  
	    System.out.println(a);//11 because second condition is checked 
	    //ternary operator
	    int min=(a<b1)?a:b1;  
	    System.out.println(min); //5 
	    
	    
	}
	
}

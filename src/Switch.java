import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {  
	 int choice;  

	    System.out.println("select the choice:");
	    System.out.println("1.Idly");
	    System.out.println("2.Rice");
	    System.out.println("3.Chapathi");
	    System.out.println("4.Dosa");
	  
	   Scanner sn=new Scanner(System.in);
	   choice=sn.nextInt();
	    sn.close();
	    switch(choice){  
	    case 1: System.out.println("You have selected Idly");break;  
	    case 2: System.out.println("You have selected Rice");break;  
	    case 3: System.out.println("You have selected Chapathi");break;  
	    case 4: System.out.println("You have selected Dosat");break;  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
}
}

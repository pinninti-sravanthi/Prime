import java.util.Scanner;

public class Control {
	public static void main(String[] args) {  
		//if..else
	    int age=20;  
	    if(age>18){  
	        System.out.println("Eligible for voting");  
	
	    }
	    else{  
	        System.out.println("Not Eligible for voting");  
	    }  
	    //else if ladder
	    int marks; 
	    System.out.println("enter your marks");
	    Scanner sc=new Scanner(System.in);
	    marks=sc.nextInt();
	    sc.close();
	      
	    if(marks<35){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=35 && marks<40){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=40 && marks<50){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=50 && marks<60){  
	    	System.out.println("B grade");  
	    }  
	    else if(marks>=60 && marks<80){  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!"); 
	    }
	   //for each loop
	    int arr[]={12,23,44,56,78};  
	    for(int i:arr){  
	        System.out.println(i);  
	    }  
	    
	    
	}
	
}

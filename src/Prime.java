

public class Prime {
	public static void main(String... commandline_args)
	{
	  try
	  { 
	      
	        int checkLimit=20;
	        int check=0,count=0;
	     for(int i=2;count<=20;i++){
	            check=0;
	            for(int j=1;j<=i;j++)
	            {
	                if(i%j==0)
	                {
	                    check++;

	                }
	            }
	            if(check==2)
	            {
	                checkLimit++;
	                count++;
	                System.out.println(i);
	                               
	            }               
	        }
	        }
	  catch(Exception e) 
	  {
	    System.out.println(e);
	  }
	}


}

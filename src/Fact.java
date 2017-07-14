

public class Fact {
	 
		public static void main(String args[])
		   {
		      //String original, reverse = "";
		      //Scanner in = new Scanner(System.in);
		 
		   //   System.out.println("Enter a string to check if it is a palindrome");
		     // original = in.nextLine();
		 //in.close();
		
		 String result=task("madam");
		 String expected="madam";
		 test(result,expected);
		   }
		private static String task(String c) {
			String original=c, reverse = "";
			int length = original.length();
			 
		      for ( int i = length - 1; i >= 0; i-- )
		         reverse = reverse + original.charAt(i);
			return reverse;
		}
		public static void test(String r,String e) {
		      if (r.equals(e))
		         System.out.println("test pass.");
		      else
		    	  System.out.println("fail");
		      
		  
	}	   		
		   		
}

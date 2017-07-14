
public class StringComparison2 {
public static void main(String[] args) {
	   long startTime = System.currentTimeMillis();  
       StringBuffer sb = new StringBuffer("String");  
       for (int i=0; i<10000; i++){  
           sb.append("is an immutable class");  
       }  
       System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
       startTime = System.currentTimeMillis();  
       StringBuilder sb2 = new StringBuilder("String");  
       for (int i=0; i<10000; i++){  
           sb2.append("is an immutable clas");  
       }  
       System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
}
}

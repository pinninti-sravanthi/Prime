
public class Toggle {
	public static void main(String[] args) {
		String ini="abcdefgh";
		  char[] input= ini.toCharArray();
		  char ch = 'A';
	    for(int i=0;i<input.length;i+=4)
	    {
	    	char temp;
	    	temp=input[i];
	    	input[i]=input[i+1];
	    	input[i+1]=temp;
	    }
	    char h = ch++;
	    System.out.println(input);
	    System.out.println(h);
	    }
}




//To check for palindrome string
import java.util.Scanner;

public class StringReverse {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String b = "";
	        int flag = 0;
	        for(int i = A.length()-1; i>=0; i-- )
	        {
	        	b = b+ A.charAt(i);
	        }
	        
	        if(b.equals(A))
	        {
	            System.out.println("Yes");
	        }
	        else
	            {System.out.println("No");}
	        /* Enter your code here. Print output to STDOUT. */
	        
	    }
	}


package test;

import java.util.StringTokenizer;

public class Understanding_Tokenizers 
{
	public static void main(String args[]) 
	{
		int tokens_avail = 0;
		System.out.println("***********LEARNING TOKENS********");
		
		StringTokenizer s = new StringTokenizer("Hey,There,Saurabh,Here,Learning,Tokenizers",",");
		while(s.hasMoreElements()) 							//Here (,) is taken as delimiter
		{
			tokens_avail =  s.countTokens();
			System.out.println("Total number of tokens are : "+tokens_avail);
			System.out.println(s.nextToken());
		}
	}
}

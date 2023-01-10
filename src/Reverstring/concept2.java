package Reverstring;

public class concept2 
{
	public static void main(String[] args) 
	{
		String s1="my name is akshay";
		
		String[] splite = s1.split(" ");
		
		for(int i=0; i<=splite.length-1; i++)
		{
			String org = splite[i];
		
			 String rev = reversestring(org);
			
			 System.out.println(rev);

		}
	
	}
	public static String reversestring(String inp)
	{
		String rev = "";
		
		for(int i=inp.length()-1; i>=0; i--)
		{
			rev=rev+inp.charAt(i);
		}
		return rev;
	}

}

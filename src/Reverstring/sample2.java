package Reverstring;

public class sample2 
{
	public static void main(String[] args)
	{
		String ori="kanade";
		
		String rev="";
		
		for(int i=ori.length()-1;i>=0;i--)
		{
			rev=rev+ori.charAt(i);
		}
		System.out.println(rev);
			
		
	}

}

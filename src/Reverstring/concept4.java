package Reverstring;

public class concept4 
{
	public static void main(String[] args)
	{
		String s1="my name xyz";
		
		String[] splite = s1.split(" ");
		
		for(int i=0; i<=splite.length-1; i++)
		{
			String org = splite[i];
			
			String rev = "";
			
			for(int j=org.length()-1; j>=0; j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}

}

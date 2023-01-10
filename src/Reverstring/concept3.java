package Reverstring;

public class concept3
{

	public static void main(String[] args) {
		
		String s1="my name is xyz";
		
		String[] splite = s1.split(" ");//{my(0),name(1),is(2),xyz(3)}
		
		for(int i=0; i<=splite.length-1; i++)
		{
			String org = splite[i];
			
			if(i%2!=0)// change case-->(i%2==0)
			{
				 String rev = reversestring(org);
				 System.out.println(rev);
			}
			else
			{
				System.out.println(org);
			}
		
		}
	}
	public static String reversestring(String org)
	{
		String rev = "";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		return rev;
		
	}
}

package reverse_number;

public class sample1 
{
	public static void main(String args[])
	{
		int orgnum=1234;
		String s1 = Integer.toString(orgnum);
		
		String rev = "";
		
		for(int i=s1.length()-1; i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		int s2 = Integer.parseInt(rev);
		System.out.println(s2);
	}

}

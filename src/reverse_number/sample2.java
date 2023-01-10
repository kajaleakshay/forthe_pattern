package reverse_number;

public class sample2 
{
	public static void main(String args[])
	{
		int num=56789;
		String s1 = Integer.toString(num);
		String rev = "";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		int revnum = Integer.parseInt(rev);
		
		System.out.println(revnum);
	}

}

package splite;

public class sample2 
{
	public static void main(String args[])
	{
		String s1="my name is abhitabh ";
		
		String[] splite = s1.split(" ");
		
		System.out.println("to seperate by single word");
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println("to seperate by the full world");
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(splite[i]);
		}
	}

}

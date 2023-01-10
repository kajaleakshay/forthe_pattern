package splite;

public class splite1 
{
	public static void main(String args[])
	{
		String s1="my name is akshay";
		
		String[] splite = s1.split(" ");
		
		System.out.println(splite[1]);
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		System.out.println(" to seperate the world only");
		for(int i=0; i<=s1.length()-1;i++)
		{
			System.out.println(splite[i]);
		}
	}

}

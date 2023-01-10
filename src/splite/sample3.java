package splite;

public class sample3 
{
	public static void main(String[] args) 
	{
		String s1="i am perfect";
		
		String[] splite = s1.split(" ");
		
	System.out.println("if u want that the ecah word is seperate");
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(s1.charAt(i));
		}
		

		
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(splite[i]);
		}
	}

}

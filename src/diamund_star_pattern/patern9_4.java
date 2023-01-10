package diamund_star_pattern;

public class patern9_4 
{
	public static void main(String[] args) 
	{
		int star=1; // staring star
		int space=5; // starting space
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
		
	}

}

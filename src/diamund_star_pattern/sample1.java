package diamund_star_pattern;

public class sample1 
{
	public static void main(String[] args) 
	{
		int space=2;
		int star=1;
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
		
		
		
	}

}

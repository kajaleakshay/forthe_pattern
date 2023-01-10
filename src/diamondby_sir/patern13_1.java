package diamondby_sir;

public class patern13_1 
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=0;
		
		for(int i=0; i<=7; i++)
		{
			for(int j=0; j<=space;j++)
			{
				System.out.println(" ");
			}
			for(int j=0; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
		
	}

}

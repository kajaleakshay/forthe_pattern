package diamondby_sir;

public class patern14_1 
{
	public static void main(String[] args)
	{
		int star=7;
		
		for(int i=0; i<=9; i++)
		{
			for(int j=0;j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
	}

}

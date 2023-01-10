package diamondby_sir;

public class patern15_1 
{
	public static void main(String[] args) 
	{
		int space=5;
		int star=1;
		
		for(int i=0; i<=11; i++)
		{
			for(int j=0; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<6)
			{
				space--;
				star=star+2;
				
			}
			else
			{
				space++;
				star=star-2;
			}
			
		}
	}

}

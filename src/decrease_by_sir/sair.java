package decrease_by_sir;

public class sair 
{
	public static void main(String[] args) 
	{
		int star=3;
	
		for(int i=0; i<5; i++)
		{
			for(int j=1;j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
		}
		
	}

}

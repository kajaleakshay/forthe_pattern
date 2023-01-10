package increasse_by_ssir;

public class spacecontent 
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=5;
		
		for(int i=0; i<=7; i++)
		{
			for(int j=0; j<=space; j++)
			{
				System.out.print(j);
			}
			for(int j=0; j<=star; j++)
			{
				System.out.print(j);
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}

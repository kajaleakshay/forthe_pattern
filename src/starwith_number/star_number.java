package starwith_number;

public class star_number 
{
	public static void main(String[] args) 
	{
		int space=1;
		int star=7;
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=star;j++)
			{
				System.out.print(j); //i, j
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}

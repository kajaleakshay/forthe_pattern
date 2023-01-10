package increasse_by_ssir;

public class star_1
{

	public static void main(String[] args)
	{
		
		int star=3;
		for(int i=1; i<=3;i++)// it is for the row
		{
			for(int a=1; a<=star; a++)// it is for the starting from the no star(no of star at 1 st row)
			{
			System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
	}
}

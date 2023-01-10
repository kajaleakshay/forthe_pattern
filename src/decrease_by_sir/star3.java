package decrease_by_sir;

public class star3
{
public static void main(String[] args)
{
	int star = 3;
	for(int a=1;a<=5;a++)// it is for the row only bt some time str in not much that quantity
	{
		for(int i=1;i<star;i++)//it is for the coloumn and no. of star in first row
		{
			System.out.print("*");
		}
		System.out.println();
		star--;
	}
}
}

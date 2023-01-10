package multiple_line;

public class raw_column
{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) // for the raws
		{
		for(int a=1;a<=8;a++)  // for the column
		{
			System.out.print("*");/// removed ln
		}
		
		System.out.println(); // remove the ln then it is in one by one
		}
	}

}

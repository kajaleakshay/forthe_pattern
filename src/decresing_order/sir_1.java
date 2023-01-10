package decresing_order;

public class sir_1 
{
	public static void main(String[] args) {
		
		int star=7;
		for(int a=1; a<=5;a++)
		{
			for(int i=1; i<=star; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			// star--;
			star =star-3;
		}
	}

}

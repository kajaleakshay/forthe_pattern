package decresing_order;

public class sir_3 
{
	public static void main(String[] args) {
		
		int star=4;
		
		for(int i=1; i<=4;i++)// for the raws
		{
			for(int a=1;a<=star;a++)  // for the colomn
			{
				System.out.print("*");
				
			}
			System.out.println();
			star--;
		}
	}

}

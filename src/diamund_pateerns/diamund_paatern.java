package diamund_pateerns;

public class diamund_paatern 
{
	public static void main(String[] args) {
		
		for(int a=1;a<5;a++)
		{
			for(int b=a; b<=5;b++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<a;b++)
			{
				System.out.print("*");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int d=1;d<=5;d++)
		{
			for(int e=1;e<=d;e++)
			{
				System.out.print(" ");
			}
			for(int e=d; e<5;e++)
			{
				System.out.print("*");
			}
			for(int e=d; e<=5;e++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

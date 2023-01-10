package increasse_by_ssir;

public class star2 
{
	public static void main(String[] args) {
		
		int star=4;
		for(int a=1; a<5; a++)// it is for the no. of the row
		{
			for(int i=1; i<=star; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+1;
		}
	}

}

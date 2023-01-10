package increasse_by_ssir;

public class star3 
{
	public static void main(String[] args) {
		
		int star =5;
		for(int i=1; i<7; i++)//is for the the rrow declaration
		{
			for(int a=2; a<=star; a++)//it is for the staring no of the star
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+4;
		}
	}

}

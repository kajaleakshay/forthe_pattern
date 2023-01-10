package factorial_fornum;

import java.util.Scanner;

public class factorials 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("entre the num");
		int num = s.nextInt();

		int fact = 1;
		for(int i=num; i>0; i--)
		{
			
			fact=fact*i;
		}
		System.out.println(fact);
		
		
	}

}

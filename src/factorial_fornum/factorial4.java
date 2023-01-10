package factorial_fornum;

import java.util.Scanner;

public class factorial4 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("entre the value");
		
		 int num = s.nextInt();
		 
		int fact=1;  //flow maintaing
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
	}

}

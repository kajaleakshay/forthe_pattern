 package factorial_fornum;

import java.util.Scanner;

public class fact2 
{

	public void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("entre the vlue");
		int num = s.nextInt();
						// 4!=4*3*2*1=24
		int fact=1;   // it ued to store the value and used in next loop
		for(int i=num;i>=0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);//loop1-4*1=4
		// flow
		//loop1-4*1=4
		//loop2-4*3=12
		//loop 3-12*2=24
		//loop 4-24*1=24
	}
}

package findtheprimeno;

public class example10_primeNumberby_sir
{
	public static void main(String[] args) {

		int num = 5;                         
		int count = 0;  //
				    	
		//                    2<6
		for (int i = 2; i < num; i++)           // 
		{		
			//  6%2=0== 0
			if (num % i == 0)
			{
				count++;    //1
				break;
			}
		}

		if (count == 1)  //1==1
		{
			System.out.println("given number is not a prime number");
		} 
		else
		{
			System.out.println("given number is a prime number");
		}

	}
	
	// find prime no from 1 to 100
}

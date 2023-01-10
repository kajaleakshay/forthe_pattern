package armtrong_number;

public class num11 
{

	public static void main(String[] args) 
	{
		// concept no 1--to get the last digit
		// num%10
		
		// to remove the last digit 
		// num/10
		
		int num=153;
		
		int sum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(sum==num)
		{
			System.out.println("oky");
		}
		else
		{
			System.out.println("not oky");
		}
	}
}

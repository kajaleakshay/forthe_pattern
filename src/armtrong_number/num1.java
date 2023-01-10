package armtrong_number;

public class num1
{
	public static void main(String[] args) 
	{
		// concept 1 to get the last element
		// num%10--last number fget
		
		// concept 2--to remove the last number
		//num/10-- to remove the last number
		
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

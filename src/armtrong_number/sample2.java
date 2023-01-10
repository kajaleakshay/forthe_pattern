package armtrong_number;

public class sample2 
{
	public static void main(String[] args) 
	{
		int num=153;
		
		int sum=0;
		
		// modulus operation to get the last integer
		int rem=num%10;
		System.out.println(rem);
		
		// to remove the last no
		int last = num/10;
		System.out.println(last);
		
		for(int i=num; i>0;i=i/10)
		{
			int remm=i%10;
			sum=sum+(remm*remm*remm);
			
			
		}
		System.out.println(sum);
		
		if(sum==num)
		{
			System.out.println("num is armstrong no");
		}
		else
		{
			System.out.println("num is not the armstrong num");
		}
	}

}

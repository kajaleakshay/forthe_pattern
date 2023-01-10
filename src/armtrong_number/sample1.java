package armtrong_number;

public class sample1
{
	public static void main(String[] args)
	{
		int ori = 12;
		 
		int sum=0;
		for(int i=ori;i>0;i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
			
		}
		System.out.println(sum);
		
		if(sum==ori)
		{
			System.out.println("no is armstrong no");
		}
		else
		{
			System.out.println("no is not the armtrong no");
		}
		
		
		
		
	}

}

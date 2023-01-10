package armtrong_number;

public class num 
{
	public static void main(String args[])
	{
		int orgnu=153;
		
		int sum=0;// to used the multiple time in loop
		
		for(int i=orgnu; i>0;i=i/10)
		{
			int rem = i%10;
			
			sum=sum+(rem*rem*rem);
			
		}
		System.out.println(sum);
		
		if(sum==orgnu)
		{
			System.out.println("nu is okay");
		}
		else
		{
			System.out.println("not ok");
		}
		
	}

}

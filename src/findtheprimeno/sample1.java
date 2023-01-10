package findtheprimeno;

public class sample1 
{
	public static void main(String args[])
	{
		int orgno=7;
		int count=0;
		
		for(int i=2;i<orgno;i++)
		{
			if(orgno%i==0) {
			
				count++;
				break;
				
			}
		
		}
		if(count==1) // if the count is zero then no is the prme no
		{
		System.out.println("given no is the not prime no");
		}
		else
		{
			System.out.println("givn no is  prime no");
		}
	}

}

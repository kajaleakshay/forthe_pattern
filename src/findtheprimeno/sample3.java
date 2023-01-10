package findtheprimeno;

public class sample3 
{
	public static void main(String args[])
	{
		int num=5;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("no is not the prime");
		}
		else
		{
			System.out.println("no is the prime");
		}
	}

}

package findtheprimeno;

public class sample2 
{
	public static void main(String[] args) 
	{
		
		int no=4;
		int count=0;
		
		for(int i=2;i<no;i++)// check pont
		{
			if(no%i==0)// check point
			{
				count++;
			break;
			}
		}
		if(count==1)// if count is zero the no is the prime no
		{
			System.out.println("no. is not hte prime no");
		}
		else
		{
			System.out.println("no. is the prime no");
		}
		
		
	}

}

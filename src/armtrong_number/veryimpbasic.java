package armtrong_number;

public class veryimpbasic 
{
	public static void main(String[] args) 
	{
		int orgnu=153;
		
//		// to get the last integer
//		int rem = orgnu%10;
//		System.out.println(rem);
//		
//		// to remover the last element
//		orgnu=orgnu/10;
//		System.out.println();
		
		int sum=0;
		for(int i=orgnu;i>0; i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(sum==orgnu)
		{
			System.out.println("is is okay");
		}
		else
		{
			System.out.println("it is not a armtron number");
		}
		
		
	}

}

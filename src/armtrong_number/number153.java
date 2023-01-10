package armtrong_number;

public class number153 
{
	public static void main(String arges[])
	{

		int OrgNum=153;
		
		int sum = 0;/// to store the value
		
		for(int i=OrgNum;i>0; i=i/10)
		{
			int rem = i%10;// to get last integer
			
			sum=sum+(rem*rem*rem);
			
		}
		
		System.out.println(sum);
		
		if(OrgNum==sum)
		{
			System.out.println("the no.is armtrong no"+OrgNum+"it true");
		}
		else
		{
			System.out.println("the no"+OrgNum+"is not true");
		}
		
		
		
/*	
 * 
 * 
 *      OrgNum=OrgNum/10;  //153/10 =15
		System.out.println(OrgNum);
			
		To get the last num
		int rem = OrgNum%10;  // 153%10= 3
		System.out.println(rem);

		
		
		
	*/	
		
		
	}

}

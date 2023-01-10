package Reverstring;

public class sampleconcept1 
{
	public static void main(String[] args) {
		
		String s1="i am test engg";
		
		String[] splite = s1.split(" ");

		for(int i=0;i<=splite.length-1;i++)
		{
			String org = splite[i];
			 
			String rev="";
			
			for(int j=org.length()-1; j>=0 ;j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.println(rev+" ");
		}
		
	}

}

package Reverstring;

public class bysir 
{

	public static void main(String[] args)
	{
		String org="abcd";            //0 to 3
		String rev="";            //dcba
		
		//                                        -1>=0
		for(int i=org.length()-1; i>=0; i--)
		{  //                                     0
			rev = rev+ org.charAt(i);                       // dcb + a  = dcba
		}
		
		System.out.println(rev);
		
		
	}

}

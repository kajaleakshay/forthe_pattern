package compare_twoarrays;

import java.util.Arrays;

public class sample1 
{
	public static void main(String args[])
	{
		int ar[]= {10,20,30};
		int ar1[]= {10,20,30};
		int ar2[]= {20,50,80};
		int ar3[]= {00,10,30};
		
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.equals(ar2, ar3));
		System.out.println(Arrays.equals(ar2, ar1));
		
		
	}

}

package hashmap;

import java.util.HashMap;
import java.util.Set;

public class example14_Count_Reapeating_Char_In_String_Using_Hashmap 
{
	public static void main(String[] args) {

		String org = "abcaba";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
					             //6<=5
		for (int i = 0; i <= org.length() - 1; i++)     //0-5
		{					  //               5
			char s1 = org.charAt(i);   //a
			
			if (mp.containsKey(s1))  //a--> false,b-->false,c-->false,a-->true,b-->false,
			{
				mp.put(s1, mp.get(s1) + 1);   
			} 
			else
			{
				mp.put(s1, 1);   //b,1
			}
		}
		
		
		Set<Character> allKeys = mp.keySet(); //[a, b, c]
		System.out.println("---print occuerence of each char--");
//		//print occurence of each char
		for (Character key : allKeys) 
		{	
			System.out.println(key +": "+ mp.get(key));
		}
		
		System.out.println("---print only duplicate char--");	
		//print only duplicate char
		for (Character key : allKeys) 
		{
			if(mp.get(key)>1)
			{
				System.out.println(key +": "+ mp.get(key));
			}
		}
		
		//System.out.println("a: "+ mp.get('a'));
		
	}

}

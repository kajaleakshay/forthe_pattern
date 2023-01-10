package hashmap;

import java.util.HashMap;
import java.util.Set;

public class exmple14_string1 
{
	public static void main(String[] args) 
	{
		String org="abc abc bc bc cd ";
		
		String[] splite = org.split(" ");
		
		HashMap<String,Integer> mp = new HashMap<String, Integer>();
		
		for(int i=0; i<=splite.length-1; i++)
		{
			String s1 = splite[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1,1);
			}
			
			
		}
		Set<String> allkeys = mp.keySet();
		
		System.out.println("--to get the all valuees--");
		for(String key:allkeys)
		{
			System.out.println(key+":"+mp.get(key));
		}
		
		System.out.println("---to print only repate string--");
		for(String key:allkeys)
		{
			if(mp.get(key)>1) 
			{
				System.out.println(key+":"+mp.get(key));

			}
		}
	}

}

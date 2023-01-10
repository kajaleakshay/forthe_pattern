package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmapdetails 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
	
		hp.put(104,"lavata");
		hp.put(105,"karmveer");
		hp.put(106,"karta");
		hp.put(107, "trusty");
		
		System.out.println("--to get the all keys--");
		Set<Integer> mp = hp.keySet();
		
		for(Integer key:mp)
		{
			System.out.println(key);
		}
		
		System.out.println("----to print hte all values--");
		for(Integer key:mp)
		{
			System.out.println(key+":"+hp.get(key));
		}
		
	
		
	}

}

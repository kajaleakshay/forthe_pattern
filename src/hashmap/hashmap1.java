package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(10,"akshay");
		mp.put(11, "kanhoba");
		mp.put(15, "ravi");
		
		System.out.println(mp.get(15));
		System.out.println(mp.containsValue("kanhoba"));
		
		Set<Integer> keys = mp.keySet();
		
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		System.out.println("--to print all keys and valurs--");
		
		for(Integer key1:keys)
		{
			System.out.println(key1+" :"+mp.get(key1));
		}
		
	}

}

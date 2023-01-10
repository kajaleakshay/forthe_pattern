package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		
		mp.put(101, "ravikant");
		mp.put(102,"kaveri");
		mp.put(103,"karmveer");
		
	     System.out.println(mp.get(102));
	     
	   System.out.println("---get all keys---");
	   
	  Set<Integer> keys = mp.keySet();
	  
	  for(Integer key:keys)
	  {
		  System.out.println(key);
	  }
	     System.out.println("--to print the all keys and values--");
	     for( Integer key1:keys)
	     {
	    	 System.out.println(key1+" :"+mp.get(key1));
	     }
		
		
	}

}

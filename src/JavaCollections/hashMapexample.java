package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "hello"); 
		hm.put(1, "Gudbye"); 
		hm.put(42, "morning"); 
		hm.put(3, "evening"); 
		System.out.println(hm.get(42)); 
		hm.remove(42);
		System.out.println(hm.get(42));
		
		//Creating hashtable and passing table to set collections
		Set sn= hm.entrySet();
		Iterator it =sn.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next()); // It is used in a simple set which doesn't have key value
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());  //Fetching the hashmap key in the set
			System.out.println(mp.getValue()); ////Fetching the hashmap value corresponding to it's key in the set
		}
	}

}

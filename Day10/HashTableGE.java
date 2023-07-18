import java.util.*;
public class HashTableGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hm = new Hashtable();
		//hm.put(null, null); NPE
		hm.put(2, "abc");
		hm.put(4, "bcd");
		hm.put(6, "cde");
		hm.put(2, "def");//ate duplicate key the value gets updated
		hm.putIfAbsent(5, "abc");
		//hm.put(null, null); NPE
		//hm.put(null, "ad"); Only updation at the key 
		//hm.put("ABD", null); NPE
		System.out.println(hm);
		System.out.println(hm.getOrDefault(4, "Not found"));
		System.out.println(hm.getOrDefault(5, "Not found"));
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(Object key:hm.keySet())
		{
			System.out.println(key);
		}
		

	}

}

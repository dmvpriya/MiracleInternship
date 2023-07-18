import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class HashTableNGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hm = new Hashtable();
		//hm.put(null, null); NPE
		hm.put(1, "key");
		hm.put('A', 2);
		hm.put(3.8, 'C');
		//hm.put(null, null); NPE
		//hm.put(null, "ad"); Only updation at the key 
		//hm.put("ABD", null); NPE
		System.out.println(hm);
		System.out.println(hm.getOrDefault(4.8, "Not found"));
		System.out.println(hm.getOrDefault(3.8, "Not found"));
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

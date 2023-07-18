import java.util.*;
public class HashMapGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(2, "abc");
		hm.put(4, "bcd");
		hm.put(6, "cde");
		hm.put(2, "def");//ate duplicate key the value gets updated
		hm.putIfAbsent(5, "abc");
		hm.remove(5);
		
		boolean a = hm.containsKey(2);
		System.out.println(a);
		boolean a1 = hm.containsValue("abc");
		System.out.println(a1);
		System.out.println(hm);
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(Map.Entry m1 : hm.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}

}

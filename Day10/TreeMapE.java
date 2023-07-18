import java.util.*;
public class TreeMapE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap();
		tm.put(2, "aaaaaaaaaab");
		tm.put(3, "bbbbba");
		//tm.put(null, "aab"); NullPointerException
		tm.put(5, "aab");
	    
		System.out.println(tm);
		Set s = tm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(Map.Entry m1:tm.entrySet())
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}

}

import java.util.*;
public class HashSetE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("java");
		hs.add(5);
		hs.add('a');
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(5);
		hs1.add(54);
		hs.addAll(hs1);
		System.out.println(hs);
		hs.remove(5);		
		System.out.println(hs);
		hs.retainAll(hs1);
		System.out.println(hs);
		hs.removeAll(hs1);
		System.out.println(hs);
		System.out.println(hs1);
		hs.clear();
		System.out.println(hs);
		hs.addAll(hs1);
		System.out.println(hs);
		hs.add(7);
		hs.add("java");
		System.out.println(hs);
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
		for(int j:hs1)
		{
			System.out.println(j);

		}
		
			
		





	}

}

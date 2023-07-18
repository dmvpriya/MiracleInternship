import java.util.*;
public class LinkedHashSetEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(78);
		hs.add(5);
		hs.add(64);
		for(int j:hs)
		{
			System.out.println(j);

		}
		Set s = new LinkedHashSet();
		s.add(5);
		s.add(4);
		s.add("java");
		s.add("program");
		for(Object o:s)
		{
			System.out.println(o);
		}

	}

}

import java.util.*;

public class HashSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("java");
		hs.add(5);
		hs.add('a');
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());

		}

	}

}

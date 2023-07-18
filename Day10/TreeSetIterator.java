import java.util.*;
public class TreeSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(2);
		ts.add(7);
		ts.add(9);
		Iterator i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
		Iterator i1 = ts.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}

	}

}

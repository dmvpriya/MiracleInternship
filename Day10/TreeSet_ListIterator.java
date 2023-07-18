import java.util.*;
public class TreeSet_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(2);
		ts.add(7);
		ts.add(9);
		ArrayList al = new ArrayList(ts);
		ListIterator li = al.listIterator();
		System.out.println(al);

		while(li.hasNext())
		{
			System.out.println("ArrayList listiterator "+li.next());

		}
		LinkedList ll = new LinkedList(ts);
		System.out.println(ll);

		ListIterator li1 = ll.listIterator();
		while(li1.hasNext())
		{
			System.out.println("LinkedList listiterator "+li1.next());

		}
		while(li1.hasPrevious())
		{
			System.out.println("LinkedList listiterator backwards "+li1.previous());

		}

	}

}

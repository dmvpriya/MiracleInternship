import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.*;
public class LinkedHashSet_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet s = new LinkedHashSet();
		s.add(5);
		s.add(4);
		s.add("java");
		s.add("program");
		System.out.println(s);

		ArrayList al = new ArrayList(s);
		System.out.println(al);

		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println("ArrayList listiterator "+li.next());

		}
		LinkedList ll = new LinkedList(s);
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

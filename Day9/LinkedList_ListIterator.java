import java.util.*;
public class LinkedList_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add('a');
		ll.add(7.235);
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(3);
		ll1.add(4);
		ll1.add(74);
		ListIterator li1 = ll1.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
		for(int i:ll1)
		{
			System.out.println(i);
		}

	}

}

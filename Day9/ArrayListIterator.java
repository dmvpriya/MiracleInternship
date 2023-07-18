import java.util.Iterator;
import java.util.ArrayList;
public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("java");
		al.add("program");
		al.add(5);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ArrayList<Integer> ll1 = new ArrayList<>();
		ll1.add(2);
		ll1.add(4);
		ll1.add(3);
		ll1.add(5);
		Iterator<Integer> i1 = ll1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}
		Iterator<Integer> i2 = ll1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());

		}
		for(int j:ll1)
		{
			System.out.println(j);
		}
 
	}

}

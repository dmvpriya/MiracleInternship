import java.util.*;
public class ListIteratorE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(54);
		al.add(78);
		al.add(13);
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		for(int i:al)
		{
			System.out.println(i);
		}

	}

}

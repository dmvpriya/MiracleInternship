import java.util.LinkedList;

public class LinkedListEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		al.add(2);
		al.add("Java");
		al.add('A');
		al.add("Java");
		for(Object o:al)
		{
			System.out.println(o);
		}

	}

}

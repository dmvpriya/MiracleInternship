import java.util.*;
public class ArrayListNGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("Java");
		al.add('A');
		al.add("Java");
		for(int i = 0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		
		}
		ArrayList al1 = new ArrayList();
		al1.add(2);
		al1.add("program");
		al1.addAll(al);
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		
	    System.out.println("remove "+al1.remove(1));
	    System.out.println("remove all "+al1.removeAll(al));
	    System.out.println("retain all "+al1.retainAll(al));
	    al1.clear();
	    System.out.println(al1);
	    Object arr = (Object)new int[10];
	    arr = al.toArray();//collection to array
		System.out.println(arr);
		Iterator i = al.iterator();//iterator
		while(i.hasNext())
		{
			System.out.println(i.next());
		}


	}

}

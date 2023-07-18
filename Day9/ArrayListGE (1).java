import java.util.*;
public class ArrayListGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(5);
		al.add(7);
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.removeAll(al1));
		System.out.println(al.retainAll(al1));
		Object arr = new int[10];
		arr = al.toArray();
		System.out.println(arr);


	}

}

import java.util.*;
public class LinkedHashSetE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(54);
		lhs.add("java");
		lhs.add(43);
		lhs.add("Program");
        System.out.println(lhs);
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(5);
		lhs1.add(54);
		lhs.addAll(lhs1);
		System.out.println(lhs);
		lhs.remove(5);		
		System.out.println(lhs);
		lhs.retainAll(lhs1);
		System.out.println(lhs);
		lhs.removeAll(lhs1);
		System.out.println(lhs);
		System.out.println(lhs1);
		lhs.clear();
		System.out.println(lhs);
		lhs.addAll(lhs1);
		System.out.println(lhs);
		lhs.add(7);
		lhs.add("java");
		System.out.println(lhs);

	}

}

import java.util.*;
public class TreeSetE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(2);
		ts.add(7);
		ts.add(9);
		System.out.println(ts);
		TreeSet ts1 = new TreeSet();
		ts1.add(4);
		ts1.add(8);
		ts1.add(9);
		System.out.println(ts1);
		ts.addAll(ts1);
		System.out.println(ts);
		System.out.println(ts.contains(7));
		ts.remove(7);
		System.out.println(ts);
		System.out.println("Head set"+ts.headSet(0));
		System.out.println("Sub set"+ts.subSet(0, 2));

		System.out.println("Tail set"+ts.tailSet(0));





	}

}

import java.util.ArrayList;

public class ArrayListEnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
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

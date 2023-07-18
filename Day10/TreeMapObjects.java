import java.util.*;
import java.io.*;
class Add2
{
	int a,b;
	public Add2(int a,int b)
	{
		this.a = a;this.b = b;
		System.out.println(a+b);
	}
}
public class TreeMapObjects {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Add2 a1 = new Add2(3,8);
		Add2 a2 = new Add2(7,19);
		
		TreeMap<Integer,Object> hm = new TreeMap<>();
		hm.put(1, a1);
		hm.put(2, a2);
		Set s = hm.entrySet();
		Iterator i = s.iterator();
	while(i.hasNext())
	{
			Add2 a4 = (Add2)i.next();
			System.out.println(i.next());
		}
		for(Map.Entry m1 : hm.entrySet())
		{
			int a = (int)m1.getKey();
			
			Add2 a5 = (Add2)m1.getValue();
			System.out.println(a);
			System.out.println(m1.getKey()+" "+m1.getValue());
		}

	}

}

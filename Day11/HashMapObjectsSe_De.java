import java.util.*;
import java.io.*;
class Add3
{
	int a,b;
	public Add3(int a,int b)
	{
		this.a = a;this.b = b;
		System.out.println(a+b);
	}
}
public class HashMapObjectsSe_De {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Add3 a1 = new Add3(3,8);
		Add3 a2 = new Add3(7,19);
		
		HashMap hm = new HashMap();
		hm.put(1, a1);
		hm.put(2, a2);		
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/HMFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hm);		
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/HMFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(fis.available()!=0)
		{
			HashMap lhm = (HashMap)ois.readObject();
			Set s1 = lhm.entrySet();
			Iterator i3 = s1.iterator();
			while(i3.hasNext())
			{
				Add3 e4 = (Add3)i3.next();
				System.out.println("Employee id "+e4.a+" Employee name "+e4.b);
			}
		}

	}

}

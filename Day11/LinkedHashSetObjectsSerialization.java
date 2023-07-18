import java.util.LinkedHashSet;
import java.util.Iterator;
import java.io.*;
class Add implements Serializable{
	int a,b;
	public Add(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
}
public class LinkedHashSetObjectsSerialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Add a1 = new Add(3,8);
		Add a2 = new Add(7,19);
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(a1);
		hs.add(a2);
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			Add a3 = (Add)i.next();
			System.out.println(a3.a+" "+a3.b);
		}
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/LHSFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.writeObject(a2);
		oos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/LHSFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(fis.available()!=0)
		{
			Add ad = (Add)ois.readObject();
			System.out.println(ad.a+" "+ad.b);
		}
		

	}

}

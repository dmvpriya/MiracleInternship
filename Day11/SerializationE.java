import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}
public class SerializationE {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student s1 = new Student(2,"harry");
		Student s2 = new Student(3,"lucy");
		FileOutputStream fos = new FileOutputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
		fos.close();

	}

}

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
public class DeSerializationE {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student s1 = new Student(2,"harry");
		Student s2 = new Student(3,"lucy");
		FileInputStream fis = new FileInputStream("/home/training/Documents/i23M05/Day8tasks/files/FOSDemo2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(fis.available()!=0)
		{
			Student s3 = (Student)ois.readObject();
			System.out.println(s3.id+" "+s3.name);
		}
		ois.close();
		fis.close();

	}

}

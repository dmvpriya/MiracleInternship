package sample;

abstract class A{
	abstract void print();
	void display()
	{
		System.out.println("Hello");
	}
	A()
	{
		System.out.println("Hello Constructor");
	}
	
}

public class AbstractClass extends A{
	void print()
	{
		System.out.println("Hello abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new AbstractClass();
		a.display();
		a.print();
		AbstractClass a1 = new AbstractClass();
		a1.display();
		a1.print();
		

	}

}

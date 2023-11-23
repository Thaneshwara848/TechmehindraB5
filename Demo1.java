class A
{
	A()
	{	
		System.out.println("Hi A Class ...!");
	}
	void display()
	{
		System.out.println("HI Aclass Display method");
	}
}
class B
{
	B()
	{	
		System.out.println("Hi B  Class ...!");
	}
	void display()
	{
		System.out.println("HI B lass Display method");
	}
}
class  Demo1
{
	public static void main(String args[])
	{	
		System.out.println("Hi Welcome to Tech Mehindra ");
		A a = new A();
		a.display();
		B b = new B();
		b.display();
		b.display();
	
	}
}
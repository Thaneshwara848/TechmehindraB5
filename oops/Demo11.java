class A
{
	public void abc()
	{
		System.out.println("Hi A class abc method");
	}
}
class B extends A
{
	
	public void abc()
	{
		System.out.println("Hi B class abc method");
	}
	
}
class Demo11
{
	public static void main(String args[])
	{
		B a= new B();
		a.abc();
	}
}


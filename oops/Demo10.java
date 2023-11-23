class A
{
	A()
	{
		System.out.println("A class ");
	}
}
class B extends A
{
	A()
	{
		System.out.println("B  class ");
		// constructro overriden is not possible 
	}
}
class Demo10
{
	public static void main(String args[])
	{
		A a = new A(); 	
	}
}


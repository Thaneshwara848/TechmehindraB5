class A
{
	void abc()
	{
		System.out.println("Hi A class ");
	}
	void abc(int a)
	{
		System.out.println("Hi A(int a) class ");
	}
	void abc(int a,String name)
	{
		System.out.println("Hi A(int a,String name) class ");
	}
}
class Demo9
{
	public static void main(String args[])
	{
		A a= new A();
		a.abc();
		a.abc(100);
		a.abc(100,"Thanesh");
	
	}
}

//Same constructor name + multple time + different paramanter + in same class = constructor over loding..!
//Same method name + multple time + different paramanter + in same class = method over loding..!

class A
{
	A()
	{
		System.out.println("Hi A class ");
	}
}
class B  extends A
{
	B()
	{
		System.out.println("Hi B class ");
// as soon as u creat a child class object automatically super class default constructo will call 

	}
}
class  Demo8
{
	public static void main(String args[])
	{			
		B b = new B();
// as soon as u creat a child class object automatically super class default constructo will call 
		//A a = new A();	
	}
}



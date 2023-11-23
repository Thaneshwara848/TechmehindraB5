// aquring the proprty from parent to child 
	// we can reduce the no of lines in code , 2) we can re use it , 3) since less code and re useable , we can incree the performance ...!
// parent  // super // base 
class A
{
	int a =100;
	int b = 200;
	void m1()
	{
		System.out.println(a+b);
	}
}
// child // sub // derived 
class B extends A
{
	//int a =100;
	//int b = 200;
	int c = 300;
	int d = 400 ; 
	void m1()
	{
		System.out.println(a+b);
	}
	void m2()
	{
		System.out.println(c+d);
	}
}
class  Demo6{
	public static void main(String args[])
	{			
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();	
		b.m2();
	}
}



class A
{
	void draw()
	{
		System.out.println("Hi A class ");
	}
	void draw(int r)
	{

		System.out.println("Hi A(int a) class ");
	}
	void draw(int a,int b )
	{
		System.out.println("Hi A(int a,String name) class ");
	}
}
class Demo9
{
	public static void main(String args[])
	{
		A a= new A();
		a.draw();
		a.draw(100);
		a.draw(100,"Thanesh");
	
	}
}

//Same constructor name + multple time + different paramanter + in same class = constructor over loding..!
//Same method name + multple time + different paramanter + in same class = method over loding..!



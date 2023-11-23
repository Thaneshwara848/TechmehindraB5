class A
{
	int x=100;
	static void display()
	{
		System.out.println("A class ...!");
	}	
}
class Demo14
{
	public static void main(String args[])
	{
		//A a = new A();
		//System.out.println(a.x);
		//a.display();

		System.out.println(A.x);
		A.display();
	}
}
// static means : without creating a object we call the methods or variables 
// all the static beslongs to class level only 
// we can cal the all the statci varaibel using the class name . var name like A.x 
// we can cal the all the statci methods  using the class name . method name like A.abc 

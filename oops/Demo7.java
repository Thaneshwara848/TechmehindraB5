class A
{
	int x=10;
}
class B  extends A
{
	int x=100;
	void display(int x)
	{
		System.out.println(x);//1000
		System.out.println(this.x);//100 
		System.out.println(super.x); //10 
					
	}
}
class  Demo7
{
	public static void main(String args[])
	{			
		B b = new B();	
		b.display(1000);
	}
}



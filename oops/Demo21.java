class A
{
	int x;// default value of x is : 0 
	A(){}
	void abc(){}
	void xyz(){}	
}
//class B{}
//class C extends A,B{}
abstract class  B 
{
	int x;// default value of x is : 0 
	B(){}
	abstract void xyz();
	abstract void abc();
	void aaa(){}
}
interface I
{
	//int x; expected bcz no constructor '
	int x=100;
	//I(){}
	abstract void xyz();
	abstract void abc();
	//void aaa(){} only abstarct are allowed 
}
interface J 
{}
interface K  extends J,I
{}
class Demo21
{
	public static void main(String args[])
	{
		A a = new A();
		//B b = new B(); we can create a obj of abstr class 
		//I i = new I();  we can create a obj of Intergface  
	}
}
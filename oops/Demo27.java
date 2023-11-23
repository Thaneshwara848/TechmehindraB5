import java.util.Scanner;
class A
{
	Scanner sc = new Scanner(System.in);

	A() throws  InvalidAgeException
	{
		System.out.println("Enter Age ");
		int age=sc.nextInt();
		if(age<18) throw new  InvalidAgeException("Invalid Age ...!");		
	}
}
class Demo27
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}			
	}
}
class InvalidAgeException extends Exception 
{
	InvalidAgeException(String args)
	{
		super(args);
	}
}
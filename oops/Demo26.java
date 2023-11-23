class A
{
	Scanner
	Enter Age : 
	int age = sc.nextInt() ;
	void display() throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Age please try once again");
		}
	}
} 
class Demo25
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();
			a.display();
		}
		catch(InvalidAgeException iva)
		{
			System.out.println(iva);
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
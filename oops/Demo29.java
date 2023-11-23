//throw: it is used to raise a excpetion manaulayy 
// only 1 exception we canm raise at a time 


// throws : it is used to declare the costum excpetion and  check exception 
// using throws we can decalre multiple excpeiton 

import java.io.*;
class A
{
	void display() throws InvalidAgeException, FileNotFoundException, IOException

	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("I :"+i );
			if(i==20) throw new NullPointerException();
			if(i==18) throw new InvalidAgeException("Invalid Age ...!") ;
			if(i==15) throw new FileNotFoundException();
			if(i==10) throw new ArithmeticException();
			if(i==5) throw new IOException();
		}
	}
}
class Demo29
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();
			a.display();
			try
			{
			}
			catch(Exception e)
			{
			}
		}
		catch(NullPointerException np)
		{
			System.out.println("Null pointer came ...!");
			try
			{
			}
			catch(Exception e)
			{
			}
		}
		catch(InvalidAgeException iva)
		{
			System.out.println("InvalidAgeException came  ...!");
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("FileNotFoundException came  ...!");
		}
		
		catch(ArithmeticException  ae)
		{
			System.out.println("A E  came  ...!");
		}
		catch(IOException io)
		{
			System.out.println("I O  came  ...!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Thank you ...!");
			try
			{
			}
			catch(Exception e)
			{
			}
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
import java.io.*;
class A
{
	void display() throws FileNotFoundException,IOException,NullPointerException,InvalidException
	{
		for(int i=0;i<=25;i++)
		{
			if(i==20) throw new NullPointerException();
			if(i==18) throw new NumberFormatException();
			if(i==15) throw new ArrayIndexOutOfBoundsException();
			if(i==12) throw new FileNotFoundException();
			if(i==10) throw new IOException();
			if(i==5) throw new InvalidException("Invalid Age ");
			System.out.println("I :"+i);
		}
	}
}
class Demo26
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();
			a.display();
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe);
		}
		catch(InvalidException ive)
		{
			System.out.println(ive);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		catch(ArrayIndexOutOfBoundsException nfe)
		{
			System.out.println(nfe);
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println(fnf);
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
		catch(Exception e)		
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you ");	
		}
	}

}
class InvalidException extends Exception
{
	InvalidException(String arg)
	{
		super(arg);
	}
}

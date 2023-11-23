import java.util.*;
class Demo23
{
	public static void main(String args[])
	{
		m1();
	}
	static void m1()
	{
		m2();
		System.out.println("Hi m1 method  ....!");
	}
	static void m2()
	{
		m3();
		System.out.println("Hi m2 method  ....!");
	}
	static void m3()
	{
		try
		{
			System.out.println("Hi M3 method....!");
			Scanner sc = new Scanner(System.in);
			System.out.println("Hi A value  :");
			int a= sc.nextInt();

			System.out.println("Hi B value  :");
			int b= sc.nextInt();		
			int c = a/ b ; 

			System.out.println("Result is  :"+c);

		}
		catch(InputMismatchException im)
		{
			System.out.println("Please enter the Number only...!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("We cant devide anythong by zero...!");
		}
		catch(InputMismatchException im)
		{
			System.out.println("Please enter the Number only...!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you...!");
		}
	}
}
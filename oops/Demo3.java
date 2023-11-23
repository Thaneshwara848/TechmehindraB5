import java.util.Scanner;
class A
{
	int id,age,salary;
	String name,desig;
	A()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter ID : ");
		id= sc.nextInt();

		System.out.println("ENter Name : ");
		name =sc.next();

		System.out.println("ENter Age  : ");
		age= sc.nextInt();

		System.out.println("ENter Salary: ");
		salary= sc.nextInt();

		System.out.println("ENter Desig : ");
		desig= sc.next();		
	}
	void display()
	{
		System.out.println("My ID is : "+id);
		System.out.println("My Name is : "+name);
		System.out.println("My Age is : "+age);
		System.out.println("My Salary is : "+salary);
		System.out.println("My Desig is : "+desig);
		System.out.println("===================================");
	}
}


class  Demo3
{
	public static void main(String args[])
	{			
		int ch1=0;
		A a=null;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" 1 ) Create  ");
			System.out.println(" 2 ) Display ");
			System.out.println(" 3 ) Exit ");
			System.out.print(" Enter the Choice :  ");			
			ch1= sc.nextInt();
			if(ch1==1)
			{
				a = new A();
			}
			if(ch1==2)
			{
				a.display();
			}
			if(ch1==3)
			{
				System.out.println("Thank you............!");
				System.exit(0);
			}
				
		}while(ch1<=2);
	}
}



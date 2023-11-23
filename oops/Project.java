import java.util.Scanner;

class Emp
{
	int id,age;
	String name;
	int salary;
	String desig;
	static String company="Tech Mehindra";
	Scanner sc = new Scanner(System.in);
	Emp()
	{
		System.out.println("ENter ID : ");
		id= sc.nextInt();
		System.out.println("ENter Name : ");
		name =sc.next();
		System.out.println("ENter Age  : ");
		age= sc.nextInt();	
	}
	void display()
	{
		System.out.println("My ID is : "+id);
		System.out.println("My Name is : "+name);
		System.out.println("My Age is : "+age);
		System.out.println("My Salary is : "+salary);
		System.out.println("My Desig is : "+desig);
		System.out.println("My Company  is : "+Emp.company);
		System.out.println("===================================");
	}
}
class Clerk  extends Emp 
{
	Clerk()
	{	
		salary=20000;
		desig="Clerk";
	}
	
}

class Developer  extends Emp 
{	
	Developer ()
	{	
		salary=30000;
		desig="Developer";		
	}
}

class Tester  extends Emp 
{
	
	Tester ()
	{	
		salary=15000;
		desig="Tester";	
	}
}

class  Project
{
	public static void main(String args[])
	{			
		int ch1,ch2=0;
		Clerk c= null;
		Developer d= null;
		Tester t= null;
		Scanner sc = new Scanner(System.in);
		do
		{
			
			System.out.println(" 1 ) Create  ");
			System.out.println(" 2 ) Display ");
			System.out.println(" 3 ) Exit ");
			System.out.print(" Enter the Choice :  ");			
			ch1= sc.nextInt();
			if(ch1==1)
			{
				do
				{
					System.out.println(" 1 ) CLERK ");
					System.out.println(" 2 ) DEVELOPER ");
					System.out.println(" 3 ) Tester ");
					System.out.println(" 4 ) Exit");
					System.out.print(" Enter the Choice :  ");			
					ch2= sc.nextInt();
					if(ch2==1)
					{
						c= new Clerk();
					}
					if(ch2==2)
					{
						d= new Developer();
					}
					if(ch2==3)
					{
						t=new Tester();
					}
				}while(ch2<=3);
			}
			if(ch1==2)
			{
				do
				{
					System.out.println(" 1 ) CLERK ");
					System.out.println(" 2 ) DEVELOPER ");
					System.out.println(" 3 ) Tester ");
					System.out.println(" 4 ) Exit");
					System.out.print(" Enter the Choice :  ");			
					ch2= sc.nextInt();
					if(ch2==1)
					{
						c.display();
					}
					if(ch2==2)
					{
						d.display();
					}
					if(ch2==3)
					{
						t.display();
					}
				}while(ch2<=3);

			}
			if(ch1==3)
			{
				System.out.println("Thank you............!");
				System.exit(0);
			}
				
		}while(ch1<=2);
	}
}




		





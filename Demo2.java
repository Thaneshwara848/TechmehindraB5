import java.util.Scanner;
class A
{
	int id;
	String name; 
	A()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter ID : ");
		id= sc.nextInt();

		System.out.println("ENter The Name : ");
		name =sc.next();
		//age
		//salary 
		//designation 
		//phone 
		//pan 
		
	}
	void display()
	{
		System.out.println("My ID is : "+id);
		System.out.println("My Name is : "+name);
		// print all 
	}
}
class  Demo2
{
	public static void main(String args[])
	{	
		System.out.println("Hi Welcome to Tech Mehindra ");
		A a = new A();
		a.display();
	}
}



byte  : 1 byte : 8 bit 


		2 pow 8 
			 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 = 256

			256 / 2 
				-128  to  127 
				 
 


short  : 2 byte : 16 bit 

int  : 4 byte : 32 bit 

long : 8 byte : 64 bit 

float  : 4 byte : 32 bit 
 
double  : 8 byte : 64 bit 


char  : 2 byte 

boolean : true / false 


































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


























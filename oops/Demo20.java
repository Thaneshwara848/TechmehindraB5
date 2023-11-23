abstract class Bank
{
	abstract void roi();	
	abstract void AccCreation();
		void abc()
		{
			System.out.println("Hi Abc ");
		}
		
}
class Sbi extends Bank
{
	void AccCreation()	
	{
		System.out.println("Hi XYZ methiod...!");
	}
	void roi()
	{
		System.out.println("Hi ROI  methiod...! : 10 % ");
	}	
}
class Axis extends Bank
{
	void AccCreation()	
	{
		System.out.println("Hi XYZ methiod...!");
	}
	void roi()
	{
		System.out.println("Hi ROI  methiod...! : 10 % ");
	}
}
class Demo20
{
	public static void main(String args[])
	{
		Axis a = new Axis();
		a.roi();
		a.AccCreation();
		a.abc();
		// sbi obj and call the methods 
	}
}
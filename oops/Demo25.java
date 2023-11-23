import java.util.Scanner;
class Demo25
{
	public static void main(String args[])
	{
		//							UNCHECKed / Run time Exception
		int a=10;
		int b=10;
		int c= a/b;					ArithmeticException:
		System.out.println(c);	

		//String num="10A";
		String num="10";
		int n=Integer.parseInt(num); 			//NumberFormatException
		System.out.println(n);

		int arr[]={0,10,20,30,40,50,60};
		System.out.println(arr[6]);		
		//System.out.println(arr[7]); 			ArrayIndexOutOfBoundsException
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");

		//int n1=sc.nextInt(); 				// InputMismatchException

		String s="Thanesh";
		System.out.println(s);
		System.out.println(s.length());
		s=null;					//NullPointerException
		System.out.println(s.length());			
	}
}
		11: 10 to 11: 30 break
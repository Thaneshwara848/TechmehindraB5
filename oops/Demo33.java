import java.util.Scanner;
class Demo33
{
	public static void main(String args[])
	{
		//int arr[]={11,22,23,54,25,46,"Thanesh"}; we cant enter other data type 
		int arr[]={11,22,23,54,25,46};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("=======================");

		int a[]= new int[5];
		a[0]=00;
		a[1]=100;
		a[2]=200;
		a[3]=300;
		a[4]=400;
		//a[5]=400; size is fixed 
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("=======================");

		for(int x:a)
		{
			System.out.println(x);		
		}
		System.out.println("=======================");
		Scanner sc= new Scanner(System.in);
		int a1[]= new int[5];
		a1[0]=sc.nextInt();
		a1[1]=sc.nextInt();
		a1[2]=sc.nextInt();
		a1[3]=sc.nextInt();
		a1[4]=sc.nextInt();
		//a[5]=400; size is fixed 
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("=======****================");
		System.out.println("Enter the Size : ");
		int siz= sc.nextInt();
		int a11[]= new int[siz];
		for(int i=0;i<a11.length;i++)
		{
			a11[i]=sc.nextInt();
		}
		
		for(int i=0;i<a11.length;i++)
		{
			System.out.println(a11[i]);
		}
	}
}


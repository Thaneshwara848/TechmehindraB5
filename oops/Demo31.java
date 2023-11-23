class Car extends Thread
{
	public void run() 
	{
		for(int i=0;i<=30;i++)
		{
			try
			{
				if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println(Thread.currentThread().getName()+" : "+i);
				}
				if(Thread.currentThread().getName().equals("Audi"))
				{
					System.out.println("	 "+Thread.currentThread().getName()+" : "+i);
				}
				if(Thread.currentThread().getName().equals("Maruthi"))
				{
					System.out.println("		   "+Thread.currentThread().getName()+" : "+i);
				}
				
				Thread.sleep(1000);
			}
			catch( InterruptedException ie)
			{
				System.out.println(ie);
			}	
		}
	}
}
class Demo31
{
	public static void main(String args[])
	{
		Car c = new Car();
		Thread t1= new Thread(c);	
		Thread t2= new Thread(c);
		Thread t3= new Thread(c);
		t1.start();
		t2.start();
		t3.start();

		t1.setName("Benz");
		t2.setName("Audi");
		t3.setName("Maruthi");	
		for(int k=0;k<=30;k++)
		{
			
			try
			{
				System.out.println("				K :"+k);

				if(k==10)
				{
					t1.suspend();
				}

				if(k==20)
				{
					t1.resume();
				}
				if(k==15)
				{
					//t2.suspend();
				}
				if(k==16)
				{
					System.out.println("is Alive ?:"+t2.isAlive());// true
				}
				if(k==20)
				{
					t2.stop();
				}
				if(k==25)
				{
					System.out.println("is Alive ?:"+t2.isAlive());// true or false 
				}
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}


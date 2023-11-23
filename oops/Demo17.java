class Car{
	final  int speed=200;
	c color="Blk";
	int pric=500000;
	final  void gare(){
		System.out.println("5");
	}
	void carbreak(){}
}
class Benz extends Car
{
	// void gare(){System.out.println("5");} final method can not be overriden 
}
class Demo17
{
	public static void main(String args[])
	{
		Car c = new Car();
		System.out.println(c.speed);		
		//c.speed=2000;no one can abe to re assign the values 
		System.out.println(c.speed);

		Benz b= new Benz();
		b.gare();
		System.out.println(c.color);	
		System.out.println(c.pric);	
		System.out.println(c.color.toUpperCase());
	}
}
package oops;

class Pen
{
	//data member or variables
	String color = "Red";
	String company = "Cello";
	static  int price = 50;
	
	//function member or method
	public void display()
	{
		System.out.println(color+" "+company+" "+price);
	}
	
	public static void run()
	{
		System.out.println("Runniong run method...");
	}
}

public class O001_First {
	
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		//objec tof pen class
		Pen p = new Pen();
		p.price=5000;
		p.display();
	
		
		Pen p1 = new Pen();
		p1.display();
		
		Pen.run();
	}
}
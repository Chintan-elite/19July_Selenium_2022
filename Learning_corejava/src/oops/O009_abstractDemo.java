package oops;

abstract class Abs
{
	public abstract void display();
	
	public void run()
	{
		System.out.println("running run method...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		
		System.out.println("running display method...");
		
	}
	
}

public class O009_abstractDemo {
	public static void main(String[] args) {
		
		
		// Abs a = new Abs(); not possible
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.run();
	}
	
}

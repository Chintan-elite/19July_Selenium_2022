package oops;

class Sample
{
	public void display()
	{
		System.out.println("Sample class display running....");
	}
}

class Run extends Sample
{
	@Override
	public void display() {
		System.out.println("running Run class sample method...");
		super.display();
	}
}

public class O008_MethodOverriding {
	public static void main(String[] args) {
		
		Run r = new Run();
		r.display();
		
		
	}
}

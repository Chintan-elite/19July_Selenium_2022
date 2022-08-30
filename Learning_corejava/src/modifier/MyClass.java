package modifier;

class Pen
{
	private String color = "red";
	
	private void display()
	{
		System.out.println("Running display"+color);
	}
	
	private class Demo
	{
		
	}
}

public class MyClass {
	
	public static void main(String[] args) {
		
		Pen p = new Pen();
		//p.color="Green";
		//p.display();
		
		Student st = new Student();
		st.id=50;
		st.getData();
		
	}
}

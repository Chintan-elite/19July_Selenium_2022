package impclassess;

class Demo
{
	public void display()
	{
		System.out.println("runing display...");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "learn vern";
	}
}

public class I001_ObjectClass {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		System.out.println(d);
		
		
	}
	
}

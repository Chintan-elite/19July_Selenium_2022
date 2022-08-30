package exception;

public class E001_FirstDemo {
	public static void main(String[] args) {
		
		
		System.out.println("Program started...");
		
		try {
			
		//	int a = 10;
		//	int b = a/0;
			
			int a[] = new int[5];
			a[7] = 60;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Program ended...");
		
		
		
	}
}

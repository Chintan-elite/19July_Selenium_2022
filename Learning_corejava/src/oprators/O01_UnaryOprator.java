package oprators;

public class O01_UnaryOprator {
	public static void main(String[] args) {
		
		//--pre, post--
		//++pre, post++
		
		int a = 10;
		int b = a-- - a++ - a-- + --a - a++;
		        
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
	}
}

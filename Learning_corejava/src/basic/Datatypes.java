package basic;

public class Datatypes {
	public static void main(String[] args) {
		
		//Variable rules :
		//we can not use keywrod as a variable name
		//it can contans alphaniumric value and $,_ only
		//it can not be start with number
		
		//convetions
		//should start with smallletter and if there is any consicure second word then it should start wirth capital
		
		//datatypes
		//premitve datatype
		
		byte b = 20;
		short s = 129;
		int i = 560;
		long l = 23656565;
		
		float f = 56.2323f;
		double d = 5698.336;
		
		char c = 'A';
		boolean bool = true;
		
		//datatype casting
		//convert one type of data into another type
		// widinig and nerrowing
		
		
		//widening  //implicite
		int k = 10;  //4
		long k1 = k; // 8
		
		//nerrowing //explicit
		long y = 569898;
		int y1 = (int) y;
		
		int x = 'A';
		System.out.println(x);
		
		char ch = 68;
		System.out.println(ch);
		
	}
}

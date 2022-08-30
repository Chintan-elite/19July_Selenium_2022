package impclassess;

public class I002_Wrapperclass {
	public static void main(String[] args) {
		
		int i = 10;
		
		//boxing
		Integer i1 = new Integer(i);
		//auto boxing
		Integer i2 = i;
		
		
		Integer k = 23;
		//unboxing
		int k1 = k.intValue();
		//auto unboxing
		int k2 = k;
		
		
		int a = 256396;
		Integer a1  =a;
		int length =  a1.toString().length();
		System.out.println(length);
		
	}
}

package array;

public class A01_FirstArray {
	
	public static void main(String abc[]) {
		
		int[] a= new int[5];
		
		a[0] = 10;
		a[1] = 33;
		//a[5] = 100;
		
//		for(int i=0; i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int k : a)
		{
			System.out.println(k);
		}
		
		System.out.println("**********************");
		
		String sub[] = {"java","selenium","php"};
		
		for(String s : sub)
		{
			System.out.println(s);
		}
		
		
		
	}
}

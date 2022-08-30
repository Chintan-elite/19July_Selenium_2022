package oops;

class Calc
{
	public void add(int a, int b)
	{
		int r  =a+b;
		System.out.println(r);
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public void addArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("sum of array : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int k[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			k[c] = a[i];
			c++;
		}
		
		return k;
	}
	
	public void display(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

public class O004_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.add(10, 20);
		
		int sq =  c.square(5);
		System.out.println(sq);
		
		
		int a[] = {10,20,30,40,50};
		int b[] = {1,2,3,4,5,6,7};
		c.addArray(a);
		c.addArray(b);
		
		int k[] = c.revArray(b);
		
		for (int i = 0; i < k.length; i++) {
			
			System.out.println(k[i]);
		}
		
		c.display(10,20,30);
		
	}
	
	
}

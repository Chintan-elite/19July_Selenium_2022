package array;

import java.util.Scanner;

public class A02_ArrayFromUser {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("enter value foe index : "+i);
			a[i] = sc.nextInt();
		}
		
		System.out.println("********print************");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("*******sum*********");
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum is : "+sum);
		
		System.out.println("***********avg*************");
		System.out.println("Avg is : "+sum/a.length);
		
		System.out.println("**************Max***************");
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("max is : "+max);
		
		
		System.out.println("**************Min***************");
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("min is : "+min);
		
	}
}

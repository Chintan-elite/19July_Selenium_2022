package basic;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value for a :");
		int a = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		
		
		System.out.println(a);
		System.out.println(name);
		
		
		
	}
}

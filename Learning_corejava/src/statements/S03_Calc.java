package statements;

import java.util.Scanner;

public class S03_Calc {
	public static void main(String[] args) {
		
		String choice="exit";
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Enter choice :add,sub,mul,exit");
		choice = sc.next();
		
		
		if(choice.equals("add"))
		{
			int c = a+b;
			System.out.println("Addition is : "+(a+b));
		}
		else if(choice.equals("sub"))
		{
			int c = a-b;
			System.out.println("substraction is : "+(a-b));
		}
		else if(choice.equals("mul"))
		{
			int c = a*b;
			System.out.println("Multiplication is : "+(a*b));
		}
		else if(choice.equals("exit"))
		{
			System.out.println("Closed !!!!");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		}while(!choice.equals("exit"));
		
	}
}

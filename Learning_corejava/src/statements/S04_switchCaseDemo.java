package statements;

import java.util.Scanner;

public class S04_switchCaseDemo 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Grade : ");
		String grade = sc.next();
		
		switch(grade)
		{
			case "A" : 
					System.out.println("Very good !!!");
					break;
			case "B" :
					System.out.println("Good");
					break;
			case "C" :
					System.out.println("need improvement");
					break;
			default :
				System.out.println("Invalid grade");
				
		}
		
		
		
		
		
		
		
		
	}
}

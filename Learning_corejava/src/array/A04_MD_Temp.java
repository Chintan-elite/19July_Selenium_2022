package array;

import java.util.Scanner;

public class A04_MD_Temp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][5];
		
		

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("enter temp for city "+i+" for day :"+j);
				a[i][j] = sc.nextInt();
			}
			
		}
		
		
		
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("temp of city "+i+" for day :"+j+" is  : "+a[i][j]);
			}
			
		}
		
	}
}
package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_FileOutPutDemo {
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter name : ");
			String name = sc.next();
			System.out.println("enter email");
			String email = sc.next();
			try 
			{
				FileOutputStream fis = new FileOutputStream("D:\\topsgit\\"+name+".txt");
				System.out.println("file created...");
				String data = email;
				byte b[] = data.getBytes();
				fis.write(b);
				System.out.println("content Written");
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}
}

package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_fileWriter {
	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("D://topsgit//home.txt");
			System.out.println("file created...");
			String data = "sun rises in east";
			fr.write(data);
			fr.flush();
			System.out.println("data written");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

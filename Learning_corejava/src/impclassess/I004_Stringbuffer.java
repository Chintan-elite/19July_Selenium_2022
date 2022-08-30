package impclassess;

public class I004_Stringbuffer {
	public static void main(String[] args) {
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i=1;i<=100000;i++)
		{
			sb.append("Selenium");
		}
		double endTime = System.currentTimeMillis();
		
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");
		for(int i=1;i<=100000;i++)
		{
			sb1.append("Selenium");
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("Time taken by buffer : "+(endTime-startTime));
		System.out.println("Time taken by builder : "+(endTime1-startTime1));
		
	}
}

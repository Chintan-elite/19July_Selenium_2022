package impclassess;

public class I003_stringClass {
	public static void main(String[] args) {
		
		//String str = new String("java");
		
//		String s = "java";
//		String s1 =  s.concat("Selenium");
//		System.out.println(s1);
		
		String s = "this is my java String code";
		
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('h'));
		System.out.println(s.replace('a', 'P'));
		System.out.println(s.substring(11));
		System.out.println(s.substring(11,18));
		
		System.out.println("***************************");
		
		String ar[] = s.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("****************************");
		
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*******************");
		
		byte b[] = s.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

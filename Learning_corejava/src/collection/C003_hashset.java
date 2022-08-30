package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C003_hashset {
	public static void main(String[] args) {
		
		
		HashSet<String> sh = new HashSet<String>();
		sh.add("Keyboard");
		sh.add("Mouse");
		sh.add("phone");
		sh.add("charger");
		sh.add("phone");
		
		
		Iterator<String> itr = sh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}

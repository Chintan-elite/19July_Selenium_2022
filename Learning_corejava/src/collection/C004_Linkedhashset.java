package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C004_Linkedhashset {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> sh = new LinkedHashSet<String>();
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

package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C005_treset {
	public static void main(String[] args) {
		
		
		TreeSet<String> sh = new TreeSet<String>();
		sh.add("Keyboard");
		sh.add("Mouse");
		sh.add("Phone");
		sh.add("Charger");
		sh.add("Phone");
		
		
		Iterator<String> itr = sh.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}

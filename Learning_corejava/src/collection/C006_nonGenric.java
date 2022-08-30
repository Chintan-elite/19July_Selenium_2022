package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C006_nonGenric {
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(20);
		al.add(23.66);
		al.add('a');
		
		Iterator itr = al.iterator();
				
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
	}
}

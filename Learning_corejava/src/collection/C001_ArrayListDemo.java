package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArrayListDemo {
	public static void main(String[] args) {
		
		//initial size : 10
		//oldsize * 3/2 + 1 = 10 * 3 / 2 + 1 = 16
 		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("selenium");
		al.add("testing");
		al.add("php");
		al.add(null);
		
		//al.add(1,"python");
		//al.set(1, "pythone");
		//al.remove(1);
		//System.out.println("value at index 2 is : "+al.get(2));
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

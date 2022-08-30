package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_ArrayListDemo_Add {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("selenium");
		al.add("testing");
		al.add("php");
		
		
		ArrayList<String> al1 = new ArrayList<String>(al);
		al1.add("Cricke");
		al1.add("Hockey");
		al1.add("football");
		al1.add("vollyball");
		al1.addAll(al);
		
		
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

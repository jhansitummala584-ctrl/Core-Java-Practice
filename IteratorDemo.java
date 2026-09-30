package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>javaFullStack=new ArrayList<String>();
		javaFullStack.add("Html");
		javaFullStack.add("Css");
		javaFullStack.add("JavaScript");
		javaFullStack.add("React");
		javaFullStack.add("Core Java");
		javaFullStack.add("Advanced Java");
		javaFullStack.add("Spring");
		javaFullStack.add("SQL");
		javaFullStack.add("PL/SQL");
		Iterator<String>i=javaFullStack.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("====ListIterator Forward====");
		ListIterator<String>l=javaFullStack.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("====ListIterator Backward====");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		javaFullStack.forEach(System.out::println);
	}

}

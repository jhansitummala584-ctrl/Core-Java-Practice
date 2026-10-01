package set;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>hs=new LinkedHashSet<String>();
		hs.add("Core Java");
		hs.add("Spring Framework");
		hs.add("Html");
		hs.add("Css");
		hs.add("JavaScript");
		hs.add("React");
		hs.add("Css");
		System.out.println(hs);
		System.out.println("***forEach Loop***");
		for(String s:hs) {
			System.out.println(s);
		}
		System.out.println("***Iterator***");
		Iterator<String>i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("***forEach Method");
		hs.forEach(System.out::println);

	}

}

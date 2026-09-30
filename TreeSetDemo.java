package set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(9);
		ts.add(1);
		ts.add(8);
		ts.add(2);  
		ts.add(7);
		ts.add(3);
		ts.add(6);
		ts.add(4);
		ts.add(5);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(5));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(3, 8));
	}

}

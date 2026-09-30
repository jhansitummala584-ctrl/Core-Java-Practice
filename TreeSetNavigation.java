package set;

import java.util.TreeSet;

public class TreeSetNavigation {

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
		System.out.println(ts.floor(5));
		System.out.println(ts.lower(4));
		System.out.println(ts.ceiling(7));
		System.out.println(ts.higher(8));
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);

	}

}

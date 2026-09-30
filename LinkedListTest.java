package list;
//Example on LinkedList
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer>list1=new LinkedList<Integer>();
		list1.add(11);
		list1.add(45);
		list1.add(7);
		list1.add(9);
		list1.add(34);
		System.out.println(list1);
		LinkedList<Integer>list2=new LinkedList<Integer>();
		list2.addAll(list1);
		System.out.println(list2);
		System.out.println("***Basic for loop***");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("***forEach loop***");
		for(int x:list1) {
			System.out.println(x);
		}
		System.out.println("***Iterator***");
		Iterator<Integer>i=list1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("***ListIterator Forward***");
		ListIterator<Integer>l=list1.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("***ListIterator Backward***");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		} 
		System.out.println("forEach() method");
		list1.forEach(System.out::println);
	}

}

package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println(queue);
		Iterator<String>i=queue.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		queue.forEach(System.out::println);
	}

}

package list;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Html");
		list.add("Css");
		list.add("React");
		list.add("CoreJava");
		list.add("Spring");
		list.add("Project");
		System.out.println("Before Sorting");
		list.forEach(System.out::println);
		Collections.sort(list);
		System.out.println("After  Sorting");
		list.forEach(System.out::println);

	}

}

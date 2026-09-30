package list;

import java.util.ArrayList;

public class ArrayListTest {

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
		System.out.println(javaFullStack);
		ArrayList<String>webStack=new ArrayList<>();
		webStack.add("Html");
		webStack.add("Css");
		webStack.add("JavaScript");
		webStack.add("React");
		System.out.println(webStack);
		//javaFullStack.removeAll(webStack);
		//System.out.println(javaFullStack);
		javaFullStack.retainAll(webStack);
		System.out.println(javaFullStack);
	}

}

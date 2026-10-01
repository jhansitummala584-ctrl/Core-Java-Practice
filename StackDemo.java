package list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<>();
		s1.push("Html");
		s1.push("Css");
		s1.push("JavaScript");
		s1.push("Core Java");
		s1.push("Spring");
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search("Css"));
		System.out.println(s1.empty());
		System.out.println("Stack Elements");
		s1.forEach(System.out::println);
		
	}

}

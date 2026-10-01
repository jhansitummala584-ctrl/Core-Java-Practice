package list;

import java.util.ArrayList;

public class RetrieveList {

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
		for(int i=0;i<javaFullStack.size();i++) {
			System.out.println(javaFullStack.get(i));
		}
		for(String element:javaFullStack) {
			System.out.println(element);
		}

	}

}

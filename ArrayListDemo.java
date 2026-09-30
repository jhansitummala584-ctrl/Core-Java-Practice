package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		// Adding new elements to the ArrayList
		        animals.add("Lion");
		        animals.add("Tiger");
		        animals.add("Cat");
		        System.out.println(animals);
		        //Adding at specific position
		        animals.add(2,"Elephant");
		        System.out.println(animals);
		        List<String> myanimals = new ArrayList<>();
		        System.out.println(myanimals);
		        myanimals.addAll(animals);
		        System.out.println(myanimals);
		        //searching an element
		        System.out.println(animals.contains("Dog"));
		        System.out.println(myanimals.containsAll(animals));
		        //Remove an element
		        animals.remove("Cat");//remove based on element value
		        System.out.println(animals);
		        animals.remove(1);//remove by element index value
		        System.out.println(animals);
		        

	}
}

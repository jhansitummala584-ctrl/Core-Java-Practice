package list;
//sorting when collection having string type data
import java.util.ArrayList;
import java.util.Collections;

public class NamesSort {

	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<>();
		s1.add("Html");
		s1.add("Css");
		s1.add("JavaScript");
		s1.add("Core Java");
		s1.add("Spring");
		System.out.println("Before Sorting");
		s1.forEach(System.out::println);
		System.out.println("After Sorting");
		Collections.sort(s1);
		s1.forEach(System.out::println);

	}

}

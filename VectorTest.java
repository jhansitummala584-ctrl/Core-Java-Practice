package list;
//Example of Vector
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String>v1=new Vector<String>(3,6);
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size:"+v1.size());
		v1.add("Html");
		v1.add("CSS");
		v1.add("JavaScript");
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size:"+v1.size());
		v1.add("Java");
		System.out.println("Capacity:"+v1.capacity());
		System.out.println("Size:"+v1.size());
	}

}

package list;
//Retrieve elements from a vector
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		Vector<Integer>v1=new Vector<Integer>();
		for(int i=0;i<a.length;i++) {
			v1.add(a[i]);
		}
		System.out.println(v1);
		Enumeration<Integer>e=v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

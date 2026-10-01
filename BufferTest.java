package mystring;

public class BufferTest {

	public static void main(String[] args) {
		//append() method
		StringBuffer s1=new StringBuffer("Java");
		s1.append("Rules");
		System.out.println(s1);
		//insert() method
		StringBuffer sb2=new StringBuffer("Java");
		sb2.insert(4,"Core");
		System.out.println(sb2);
		//replace() method
		StringBuffer sb3=new StringBuffer("High Cost");
		sb3.replace(0,4,"Moderate");
		System.out.println(sb3);
		//reverse() method
		StringBuffer sb4=new StringBuffer("RAM");
		sb4.reverse();
		System.out.println(sb4);
		//delete() method
		StringBuffer sb5=new StringBuffer("Lakshmi Sindhu");
		sb5.delete(0, 8);
		System.out.println(sb5);
	}

}

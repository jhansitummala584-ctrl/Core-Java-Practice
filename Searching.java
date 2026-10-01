package mystring;

public class Searching {

	public static void main(String[] args) {
		String s1="Core Java My Java Love Java";
		int s=s1.indexOf('J');
		System.out.println(s);
		s=s1.indexOf('J',10);
		System.out.println(s);
		s=s1.indexOf("va");
		System.out.println(s);
		s=s1.indexOf("va",12);
		System.out.println(s);
		s=s1.lastIndexOf('J');
		System.out.println(s);
		s=s1.lastIndexOf('J',15);
		System.out.println(s);
		s=s1.lastIndexOf("va");
		System.out.println(s);
		s=s1.lastIndexOf("va",10);
		System.out.println(s);
	}

}

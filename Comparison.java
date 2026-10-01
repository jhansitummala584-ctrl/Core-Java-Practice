package mystring;

public class Comparison {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2="java";
		String s3="JAVA";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s4="Core Java";
		System.out.println(s4.startsWith("Core"));
		System.out.println(s4.startsWith("core"));
		System.out.println(s4.endsWith("Java"));
		System.out.println(s4.endsWith("core"));
		System.out.println(s4.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));

	}

}

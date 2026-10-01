package mystring;

public class Manipulation {

	public static void main(String[] args) {
		String s1="Java";
		s1=s1.concat("Rules");
		System.out.println(s1);
		String s2="Spring Framework";
		s2=s2.substring(7);
		System.out.println(s2);
		String s3="Welcome To SSSIT";
		s3=s3.substring(11, 14);
		System.out.println(s3);
		String s4="Java";
		s4=s4.replace('J', 'L');
		System.out.println(s4);
		String s5="ram@gmail.com,janu@gmail.com,charan@gmail.com";
		s5=s5.replaceFirst("gmail", "yahoo");
		System.out.println(s5);
		String s6="ram@gmail.com,janu@gmail.com,charan@gmail.com";
		s6=s6.replaceAll("gmail", "rediff");
		System.out.println(s6);
		String s7="janu";
		s7=s7.toUpperCase();
		System.out.println(s7);
		String s8="JANU";
		s8=s8.toLowerCase();
		System.out.println(s8);
	}

}

package mystring;
//String Extraction Methods
public class Extract {

	public static void main(String[] args) {
		//Using chatAt() Method
		String s1="Java";
		System.out.println(s1.charAt(2));
		//Using getChars() Method
		String s2="Good Morning";
		int sindex=5;
		int eindex=8;
		char[] c=new char[eindex-sindex];
		s2.getChars(sindex, eindex, c, 0);
		System.out.println(c);
		//Using getBytes() Method
		String s3="Oracle";
		byte[] b=s3.getBytes();
		for(int x:b) {
			System.out.println(x);
		}
		
		

	}

}

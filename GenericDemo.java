package basic;

public class GenericDemo <T>{
	T a1;
	public T getA1() {
		return a1;
	}
	public void setA1(T a1) {
		this.a1=a1;
	}
	public static void main(String[] args) {
		GenericDemo <Integer> obj1=new GenericDemo <Integer>();
		obj1.setA1(140);
		System.out.println(obj1.getA1());
		GenericDemo <String> obj2=new GenericDemo <String>();
		obj2.setA1("Ram❤️");
		System.out.println(obj2.getA1());
		GenericDemo <String> obj3=new GenericDemo <String>();
		obj3.setA1("Janu💕");
		System.out.println(obj3.getA1());
	}
}

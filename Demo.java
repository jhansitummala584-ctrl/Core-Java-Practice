package basic;
class Test{
	public int sum(int x, int y) {
		return x+y;
	}
}
public class Demo {

	public static void main(String[] args) {
		Test obj=new Test();
		int r=obj.sum(10,20);
		System.out.println("Sum="+r);
	}

}

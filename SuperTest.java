package New;
class Test1{
	int x=25;
	public void wish() {
		System.out.println("namaste");
	}
}
class Test2 extends Test1{
	int x=46;
	public void wish() {
		super.wish();
		System.out.println("Good Morning");
	}
	public void showValue() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class SuperTest {

	public static void main(String[] args) {
		Test2 obj=new Test2();
		obj.showValue();
		obj.wish();
	}

}

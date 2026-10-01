package New;
class Base{
	Base(int x){
		System.out.println("Base Class Constructor");
	}
}
class Derived extends Base{
	Derived(){
		super(10);
		System.out.println("Derived Class Constructor");
	}
}
public class ConTest {

	public static void main(String[] args) {
		
	}

}

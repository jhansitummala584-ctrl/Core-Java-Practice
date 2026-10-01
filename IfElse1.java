package practice;

public class IfElse1 {
public int findNumber(int x) {
	if(x%2==0) {
		return x;
	}else {
		return 2*x;
	}
}
	public static void main(String[] args) {
		IfElse1 obj=new IfElse1();
		int r=obj.findNumber(7);
		System.out.println("Result = "+r);

	}

}

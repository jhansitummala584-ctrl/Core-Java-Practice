package practice;
public class IfElse2 {
	public int findBigger(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	public static void main(String[] args) {
		IfElse2 obj=new IfElse2();
		int r = obj.findBigger(48, 32);
		System.out.println("Bigger Number = "+r);
	}
}

package practice;
public class NestedIf {
public boolean isLeapYear(int year) {
	if(year%100==0) {
		if(year%400==0) {
			return true;
		}else {
			return false;
		}
	}
	else {
		if(year%4==0) {
			return true;
		}else {
			return false;
		}
	}
}
	public static void main(String[] args) {
		NestedIf obj=new NestedIf();
		boolean r=obj.isLeapYear(2026);
		if(r) {
			System.out.println("This is Leap Year");
		}else {
			System.out.println("This is not a Leap Year");
		}

	}

}

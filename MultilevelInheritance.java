package New;
class GrandFather{
	int grandFatherBankBalance=5000;
	public void showgrandFatherBankBalance() {
		System.out.println("Grand Father Bank Balance="+grandFatherBankBalance);
	}
}
class Father extends GrandFather{
	int fatherBankBalance=3000+grandFatherBankBalance;
	public void showFatherBankBalance() {
		System.out.println("Father Bank Balance="+fatherBankBalance);
	}
}
class Son extends Father{
	int sonBankBalance=2000+fatherBankBalance;
	public void showSonBankBalance() {
		System.out.println("Son Bank Balance="+sonBankBalance);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Son s=new Son();
		s.showgrandFatherBankBalance();
		s.showFatherBankBalance();
		s.showSonBankBalance();
	}
}

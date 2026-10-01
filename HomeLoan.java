package interfaces;
interface Bank{
	public void homeLoan();
}
class Hdfc implements Bank{
	public void homeLoan() {
		System.out.println("Having interest 10%");
	}
}
class Sbi implements Bank{
	public void homeLoan() {
		System.out.println("Having interest 8%");
	}
}
class Axis implements Bank{
	public void homeLoan() {
		System.out.println("Having interest 11%");
	}
}
class BankBazar{
	public Bank getInstance(String cname) {
		if(cname.equals("Hdfc"))
			return new Hdfc();
		else if(cname.equals("Sbi"))
			return new Sbi();
		else
			return new Axis();
	}
}
public class HomeLoan {

	public static void main(String[] args) {
		Bank bank;
		BankBazar obj=new BankBazar();
		bank=obj.getInstance("Sbi");
		bank.homeLoan();

	}

}

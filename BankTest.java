package list;
interface Rbi{
	public void minBalance();
}
class Hdfc implements Rbi{
	public void minBalance() {
		System.out.println("Customer need to maintain 10,000 as minimum balance");

	}
}
class BankBazar{
	public Rbi getInstance() {
		return new Hdfc();
	}
}
public class BankTest {

	public static void main(String[] args) {
		BankBazar obj=new BankBazar();
		Rbi bank=obj.getInstance();
		bank.minBalance();

	}

}

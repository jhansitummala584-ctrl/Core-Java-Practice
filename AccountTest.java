package abstraction;
abstract class Account{
	public abstract void deposit();
	public abstract void withdraw();
	public void bankInfo() {
		System.out.println("Bank Name: Axis Bank");
		System.out.println("Branch: KPHB");
		System.out.println("IFSC code: AXIS007");
	}
}
class savingAccount extends Account{
	public void deposit() {
		System.out.println("50K per day");
	}
	public void withdraw() {
		System.out.println("1 Lakh per day");
	}
}
class currentAccount extends Account{
	public void deposit() {
		System.out.println("5 Lakh per day");
	}
	public void withdraw() {
		System.out.println("10 Lakh per day");
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Account account;
		account=new savingAccount();
		account.bankInfo();
		account.deposit();
		account.withdraw();

	}

}

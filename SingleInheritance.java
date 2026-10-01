package New;
class Parent{
	int parentBankBalance=7000;
	public void showParentBankBalance() {
		System.out.println("Parent Bank Balance="+parentBankBalance);
		
	}
}
class Child extends Parent{
	int childBankBalance=3000+parentBankBalance;
	public void showChildBankBalance() {
		System.out.println("Child Bank Balance="+childBankBalance);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.showParentBankBalance();
		c.showChildBankBalance();

	}

}

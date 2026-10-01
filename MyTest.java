package threading;

public class MyTest extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyTest obj=new MyTest();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();

	}

}

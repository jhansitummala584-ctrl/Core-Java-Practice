package threading;

public class MyRun implements Runnable{
	public void run() {
		//get the current execution thread name
		String tname=Thread.currentThread().getName();
		if(tname.equals("thread1")) {
			for(int i=1;i<=5;i++) {
				System.out.println("Welcome to SSIT");
			}
		}
		else {
			for(int j=1;j<=5;j++) {
				System.out.println("All the best");
			}
		}
	}
	public static void main(String[] args) {
		MyRun obj=new MyRun();
		Thread t1=new Thread(obj);
		t1.setName("thread1");
		Thread t2=new Thread(obj);
		t2.setName("thread2");
		t1.start();
		t2.start();

	}

}

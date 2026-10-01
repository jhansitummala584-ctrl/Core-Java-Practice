package threading;

public class Test {
	public void task() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);		}
	}
	public static void main(String[] args) {
		Test obj1=new Test();
		obj1.task();
		Test obj2=new Test();
		obj2.task();

	}

}
//In above program objects(obj1,obj2) perform the task sequentially. It means obj1 complete the task then only obj2 perform its task. It leads to low performance.
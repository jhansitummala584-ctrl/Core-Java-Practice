package basic;
class Car{
	String vendor;
	String model;
	Engine eng;//Association
	public Car(String vendor, String model) {
		Engine e=new Engine("Petrol",125);//Composition
		System.out.println("Engine Type="+e.engType);
		System.out.println("Engine Power="+e.power);
		this.vendor = vendor;
		this.model = model;
	}
	public void carDetails() {
		System.out.println("Car Model="+model);
		System.out.println("Car Vendor="+vendor);
	}
}
class Engine{
	String engType;
	int power;
	public Engine(String engType, int power) {
		this.engType = engType;
		this.power = power;
	}
	
}
public class CarDemo {

	public static void main(String[] args) {
		Car c=new Car("Hundai","Grandi10");
		c.carDetails();

	}

}

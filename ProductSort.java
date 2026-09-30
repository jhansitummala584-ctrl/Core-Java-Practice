package list;
//Example of Comparator Interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int productNo;
	String productName;
	double productCost;
	public Product(int productNo, String productName, double productCost) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}
	
}
class CostSort implements Comparator<Product>{
	public int compare(Product p1,Product p2) {
		if(p1.productCost>p2.productCost)
			return 1;
		else if(p1.productCost<p2.productCost)
			return -1;
		else
			return 0;
	}
}
//Name Comparator
class NameSort implements Comparator<Product>{
	public int compare(Product p1,Product p2) {
		if(p1.productName.compareTo(p2.productName)>1)
			return 1;
		else if(p1.productName.compareTo(p2.productName)<1)
			return -1;
		else
			return 0;
	}
}
public class ProductSort {

	public static void main(String[] args) {
		Product p1=new Product(1,"Mobile",6500);
		Product p2=new Product(2,"Laptop",5500);
		Product p3=new Product(3,"TV",8500);
		Product p4=new Product(4,"Printer",1500);
		Product p5=new Product(5,"Camera",9500);
		ArrayList<Product>list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println("Before Sorting");
		list.forEach(System.out::println);
		System.out.println("Sorting on Price");
		Collections.sort(list,new CostSort());
		list.forEach(System.out::println);
		System.out.println("Sorting on Name");
		Collections.sort(list,new NameSort());
		list.forEach(System.out::println);
		
		
		

	}

}

package arrays;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the number at "+i+" in array");
			a[i]=sc.nextInt();
		}
		for(int x:a) {
			System.out.print(x);
		}
		sc.close();
	}

}

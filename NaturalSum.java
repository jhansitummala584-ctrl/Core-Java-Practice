package controlStatements;

import java.util.Scanner;

public class NaturalSum {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		NaturalSum obj=new NaturalSum();
		Scanner sc=new Scanner(System.in);
		int sum=obj.calculateSum(sc.nextInt());
		System.out.println("Sum="+sum);
		sc.close();
	}
	

}

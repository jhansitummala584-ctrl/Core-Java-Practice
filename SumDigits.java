package controlStatements;

import java.util.Scanner;

public class SumDigits {
	public int digitSum(int n) {
		int sum=0,lastdigit;
		while(n>0) {
			lastdigit=n%10;
			sum+=lastdigit;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		SumDigits obj=new SumDigits();
		Scanner sc=new Scanner(System.in);
		int sum=obj.digitSum(sc.nextInt());
		System.out.println("Sum of digits="+sum);
		sc.close();

	}

}

package arrays;

public class FindSum1 {
	public int sumArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		FindSum1 obj=new FindSum1();
		int sum=obj.sumArray(new int[] {1,2,3,4,5});
		System.out.println(sum);
	}

}

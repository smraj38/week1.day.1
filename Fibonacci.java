package WEEK1.DAY1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int t1 = 0;
		int t2 = 1;
		int t3;
		System.out.println(t1);
		System.out.println(t2);
		for (int i = 2; i <= n; i++) {

			t3 = t1 + t2;
			System.out.println(t3);
			t1 = t2;
			t2 = t3;

		}
	}

}

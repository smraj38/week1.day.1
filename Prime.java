package WEEK1.DAY1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean f = false;
		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				f = true;
				break;
			}
		}
		if (!f) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

}

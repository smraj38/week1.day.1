package WEEK1.DAY1;

public class Ams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int t = n;
		int s = 0;
		while (n != 0) {
			int last = n % 10;

			last = last * last * last;

			s = s + last;
			n = n / 10;

		}
		if (s == t) {

			System.out.println(s + " is amstrong number");
		} else {
			System.out.println(s + " is not a amstrong number");
		}
	}

}

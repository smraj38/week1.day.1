package WEEK1.DAY1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=345;
		int s=0;
		while(n!=0)
		{
		int last=n%10;
		s =s+last;
		n= n/10;	
			
			}

System.out.println(s);
	}

}

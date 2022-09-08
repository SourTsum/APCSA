package playgrond;

public class testing {
	public static void main(String[] args) {
		double x = 1.000000;
		int n = 12341324;
		
		
		if(x == (double)1) {System.out.println(1);};
		
		
		double res = 1;
		if(n >=0) {
			for(int i = n; i != 0; i--) {
				res *= x;
			}
			System.out.println(res);
		} else {
			for(int i = (-1*n); i != 0; i--) {
				res *= x;
			}
			System.out.println(1/res);
		}
	}
}
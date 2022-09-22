public class topFive{

	public static int stoi(String str) {
		int res = 0;
		for(int i = 0; i < str.length(); i++) {
			res *= 10;
			res += str.charAt(i) - '0';
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(stoi("1") + 1);
		
	}

}

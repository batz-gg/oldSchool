
public class Prob4 {

	public static void main(String[] args) {
		// TODO reverse and integer using numeric operators
		int result1 = f(1243);
		int result2 = f(12005);
		int result3 = f(1);
		int result4 = f(1000);
		int result5 = f(0);
		int result6 = f(-12345);
		System.out.println(result4);
	}

	static int f(int n) {
		int sign = 1;
		if ( n == 0 ) return 0;
		if ( n < 0 )
		{
			sign = -1;
			n = -n;
		}
		int reverse = 0;
		while ( n != 0 ) {
			reverse = (reverse * 10) + (n % 10);
			n /= 10;
		}
		return sign * reverse;
	}
}


public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = f(new int[] {1});
		int result2 = f(new int[] {1, 2});
		int result3 = f(new int[] {1, 2, 3});
		int result4 = f(new int[] {1, 2, 3, 4});
		int result5 = f(new int[] {3, 3, 4, 4});
		int result6 = f(new int[] {3, 2, 3, 4});
		int result7 = f(new int[] {4, 1, 2, 3});
		int result8 = f(new int[] {1, 1});
		int result9 = f(new int[] {});
		System.out.println(result6);
	}
	
	static int f(int[] a) {
		int X = 0;
		int Y = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				Y += a[i];
			} else if(a[i] % 2 != 0) {
				X += a[i];
			} else {
				System.out.println("Please enter array of integers!");
			}
		}
		// Subtract sum of even numbers from sum of odd numbers
		return X-Y;
	}
}

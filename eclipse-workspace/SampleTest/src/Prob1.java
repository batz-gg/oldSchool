
public class Prob1 {
	
	public static void main(String[] args) {
		//Input test (list[midEl] < list[otherEl] ? 1 : 0)
		int result1 = f(new int[] {1, 2, 3, 4, 5});
		int result2 = f(new int[] {3, 2, 1, 4, 5});
		int result3 = f(new int[] {3, 2, 1, 4, 1});
		int result4 = f(new int[] {1, 2, 3, 4});
		int result5 = f(new int[] {});
		int result6 = f(new int[] {10});
		System.out.println(result2);
	}
	
	static int f(int[] a) {
		if ( a == null || a.length % 2 == 0 ) return 0;
		int middleIndex = a.length / 2;
		int middleItem = a[middleIndex];
		for (int i=0; i < a.length; i++) {
			if (i != middleIndex && a[i] <= middleItem) {
				return 0;
			}
		}
		return 1;
	}
}

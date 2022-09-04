import java.util.ArrayList;

public class isTwinPaired2 {

	public static void main(String[] args) {
		
		int a1[] = {-6, 12, 1, 24, 3, 5};
		int a2[] = {2, 4, 32};
		int a3[] = {2, 2, 2, 1, 1, 1};
		int a4[] = {1, 19, 23};
		int a5[] = {1, 2};
		int a6[] = {2, 1};
		int a7[] = {8};
		int a8[] = {17};
		int a9[] = {};
		int a10[] = {11, 3, 2, 27};
		
		System.out.println(isTwinPaired(a1));
		System.out.println(isTwinPaired(a2));
		System.out.println(isTwinPaired(a3));
		System.out.println(isTwinPaired(a4));
		System.out.println(isTwinPaired(a5));
		System.out.println(isTwinPaired(a6));
		System.out.println(isTwinPaired(a7));
		System.out.println(isTwinPaired(a8));
		System.out.println(isTwinPaired(a9));
		System.out.println(isTwinPaired(a10));
	}
	
	public static int isTwinPaired(int a[]) {
		int res = 0;
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				evenList.add(a[i]);
			} else {
				oddList.add(a[i]);
			}
		}
		
//    System.out.println(evenList.size()  + "  " + oddList.size());
		
		boolean isEvenSorted = true;
		for (int i = 1; i < evenList.size(); i++) {
			if (evenList.get(i-1).compareTo(evenList.get(i)) > 0) {
				isEvenSorted = false;
			}
		}
		
		boolean isOddSorted = true;
		for (int i = 1; i < oddList.size(); i++) {
			if (oddList.get(i-1).compareTo(oddList.get(i)) > 0) {
				isOddSorted = false;
			}
		}
		
		if(isEvenSorted && isOddSorted) {
			res = 1;
		}
		
		return res;
	}

}

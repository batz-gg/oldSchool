import java.util.Arrays;

public class Prob5 {

	public static void main(String[] args) 
	{
		// TODO all common elements
		int[] result1 = f(new int[] {1, 8, 3, 2}, new int[] {4, 2, 6, 1});
		int[] result2 = f(new int[] {1, 8, 3, 2, 6}, new int[] {2, 6, 1});
		int[] result3 = f(new int[] {1, 3, 7, 9}, new int[] {7, 1, 9, 3});
		int[] result4 = f(new int[] {1, 2}, new int[] {3, 4});
		int[] result5 = f(new int[] {}, new int[] {1, 2, 3});
		int[] result6 = f(new int[] {1, 2}, new int[] {});
		int[] result7 = f(new int[] {1, 2}, null);
		int[] result8 = f(null, new int[] {});
		int[] result9 = f(null, null);
		System.out.println(Arrays.toString(result1)); 
	}
	
	private static int[] f(int[] first, int[] second) 
	{
		if ( first == null || second == null ) return null;
		if ( first.length == 0 || second.length == 0 ) return new int[0];
		int min = ( first.length < second.length ) ? first.length : second.length;
		int[] a, b;
		if ( min == first.length) {
			a = first;
			b = second;
		}
		else 
		{
			a = second;
			b = first;
		}
		int[] c = new int[min];
		int k = 0;
		for ( int i = 0; i < a.length; i++ )
			for ( int j = 0; j < b.length; j++ )
				if ( a[i] == b[j] )
				{
					c[k] = a[i];
					k++;
				}
		int[] retArray = new int[k];
		for ( int t = 0; t < retArray.length; t++ )
			retArray[t] = c[t];
		return retArray;
	}

}

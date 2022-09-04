import java.util.Arrays;

public class isTwinPaired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isTwinPaired(new int[] {-6, 12, 1, 24, 3, 5});
		System.out.println(result);
	}
	
	public static int isTwinPaired(int[] a)
	{
		int isPairedN = 0;
		int n = a.length;
		
		if (a.length - 1 + a.length - 2 < n || n < 0)
		{
			return 0;
		}
		
		for (int i = 0; i < a.length && isPairedN == 0; i++)
		{
			for (int j = i; j < a.length && isPairedN == 0; j++)
			{
				if(a[i] +a[j] == n)
				{
					if (i + j == n)
						isPairedN = 1;
				}
			}
		}
		
		return isPairedN;
	}
	
	private static int isTwinPaired3(int[] a) {
		int[] oddNums = {};
		int[] evenNums = {};
		int k = 0;
		int l = 0;
		for ( int i = 0; i < a.length; i++ ) {
			if (a[i] % 2 == 0) {
				evenNums[k] = a[i];
				k++;
			} else {
				oddNums[l] = a[i];
				l++;
			}			
		}
		System.out.println(Arrays.toString(evenNums));
		return 1;
	}
}

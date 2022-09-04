
public class Prob6 {

  private static int f(int[] a) {
    if (a.length < 3)
      return -1;
    		
    int i = 0;
    int j = a.length - 1;
    int idx = 1;
    int leftSum = a[i];
    int rightSum = a[j];
    for (int k = 0; k < a.length - 3; k++) {
      if (leftSum < rightSum) {
        i++;
        leftSum += a[i];
        idx = i + 1;
      } else {
        j--;
        rightSum += a[j];
        idx = j - 1;
      }
    }
    if (leftSum == rightSum)
      return idx;	//Point Of Equilibrium || POE
    else
      return -1;
  }

  public static void main(String[] args) {
    int result1 = f(new int[] { 1, 8, 3, 7, 10, 2 });
    int result2 = f(new int[] { 1, 5, 3, 1, 1, 1, 1, 1, 1 });
    int result3 = f(new int[] { 2, 1, 1, 1, 2, 1, 7 });
    int result4 = f(new int[] { 1, 2, 3 });
    int result5 = f(new int[] { 3, 4, 5, 10 });
    int result6 = f(new int[] { 1, 2, 10, 3, 4 });
    int result7 = f(new int[] { 3, 2, 3 });
    System.out.println(result7 + " Reason");
  }
}

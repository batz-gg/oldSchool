class Prom3 {

  public static void main(String[] args) {
    // TODO print range of specific chars
    char[] result1 = f(new char[] { 'a', 'b', 'c' }, 0, 4);
    char[] result2 = f(new char[] { 'a', 'b', 'c' }, 0, 3);
    char[] result3 = f(new char[] { 'a', 'b', 'c' }, 0, 2);
    char[] result4 = f(new char[] { 'a', 'b', 'c' }, 0, 1);
    char[] result5 = f(new char[] { 'a', 'b', 'c' }, 1, 3);
    char[] result6 = f(new char[] { 'a', 'b', 'c' }, 1, 2);
    char[] result7 = f(new char[] { 'a', 'b', 'c' }, 1, 1);
    char[] result8 = f(new char[] { 'a', 'b', 'c' }, 2, 2);
    char[] result9 = f(new char[] { 'a', 'b', 'c' }, 2, 1);
    char[] result10 = f(new char[] { 'a', 'b', 'c' }, 3, 1);
    char[] result11 = f(new char[] { 'a', 'b', 'c' }, 1, 0);
    char[] result12 = f(new char[] { 'a', 'b', 'c' }, -1, 2);
    char[] result13 = f(new char[] { 'a', 'b', 'c' }, -1, -2);
    System.out.println(result1);
  }

  private static char[] f(char[] a, int start, int len) {
    if (start >= a.length || start < 0 || a.length > len) {
      return null;
    } else {
      int i = 0;
      char[] result = new char[] {};
      for (i = start; i < len; a[i]++) {
        result = Arrays.copyOfRange(a, start, len);
      }
      return result;
    }
  }

}

public class isMercurial {

    public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
    }

    static int isMercurial(int[] a) {

        boolean precedingOneFlag = false;

        int indexOf3 = -1;
        int indexOf1 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                indexOf1 = i;

            if (a[i] == 3) {
                indexOf3 = i;
            }

            if (indexOf1 != -1 && indexOf3 > indexOf1)
                precedingOneFlag = true;

            if (precedingOneFlag && a[i] == 1)
                return 0;
        }

        return 1;
    }
}
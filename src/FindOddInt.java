import java.util.Arrays;

public class FindOddInt {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i<a.length; i++) {
            System.out.println(count);
            count = 0;
        }
        return a[0];
    }
}
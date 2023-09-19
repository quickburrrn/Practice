import java.util.Arrays;
import java.util.Deque;

public class FindOddInt {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i<a.length; i++) {
            int count = 0;
            do {
                count++;
            }while (count<a.length && a[count] == a[i]);

            if(count % 2 == 1){
                return a[i];
            }
        }
        return 0;
    }
}
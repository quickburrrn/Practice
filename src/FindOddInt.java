import java.util.stream.IntStream;

import static java.util.Arrays.stream;
public class FindOddInt {
    public static int findIt(int[] arr) {

        /*
        Arrays.sort(a);
        for (int i = 0; i<a.length; i++) {
            int count = 0;
            int j = i;
            do {
                count++;
                j++;
            }while (j<a.length && a[j] == a[i]);

            if(count % 2 == 1){
                return a[i];
            }else{
                i += count-1;
            }
        }
         */

        var hey = stream(arr).reduce(0, (a,b) -> a ^ b);

        return hey;//stream(a).reduce()
    }
}
import java.lang.Math;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RgbToHex {
    public static String rgb(int r, int g, int b){
        String[] rgb = new String[] {Integer.toString(r),Integer.toString(g),Integer.toString(b)};

        //Arrays.stream(rgb).map(i -> )
        return (Integer.toHexString(r) + Integer.toHexString(r) + Integer.toHexString(r)).toUpperCase();
    }
}

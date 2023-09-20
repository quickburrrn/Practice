import java.math.BigInteger;
import java.lang.Math;

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        BigInteger result = BigInteger.valueOf(1);

        //result = getFactorial(n);

        //System.out.println(result);

        System.out.println(getFactorial(n));

        int[] resultArray = result.toString().chars().map(i -> i-'0').toArray();

        int count = 0;
        for (int j = resultArray.length-1; j>0; j--)  {
            if (resultArray[j]!=0){
                break;
            }
            count++;
        }
        System.out.println("count " + count);
        return count;
    }
    public static boolean isFirst = true;


    public static double getFactorial(int num){
        //timer
        long start = System.currentTimeMillis();

        //need to make this calculation more acurate
        double factorial = num*Math.log(num)-num-1;
        //need to calculate e power factorial

        //the print time
        long end = System.currentTimeMillis();
        System.out.println("Time spend on calculating factorial: " + (end-start)/1000. + "s");



        return factorial;
    }
}

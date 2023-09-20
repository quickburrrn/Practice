import java.math.BigInteger;

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        System.out.println(n);
        BigInteger result = BigInteger.valueOf(1);

        result = getFactorial(n);
        System.out.println(result);

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
    public static BigInteger getFactorial(int num){
        BigInteger factorial = BigInteger.valueOf(1);
        int diffrennceFromActualNum = 0;
        BigInteger previousSum = BigInteger.valueOf(num);

        if (num == 0)
            return BigInteger.valueOf(1);
        if (num%2==0){
            while (num-diffrennceFromActualNum>=2){
                if(!isFirst){
                    //previousSum=previousSum+(num-diffrennceFromActualNum);
                    previousSum = previousSum.add(BigInteger.valueOf(num-diffrennceFromActualNum));
                }
                isFirst = false;
                //factorial *= previousSum;
                factorial = factorial.multiply(previousSum);
                diffrennceFromActualNum+=2;
            }
        }else{
            //factorial = num*getFactorial(num-1);
            factorial = getFactorial(num-1).multiply(BigInteger.valueOf(num));
        }
        return factorial;
    }
}

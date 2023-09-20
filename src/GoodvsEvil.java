import java.util.Arrays;

public class GoodvsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] good = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bad = Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] goodValues = {1, 2, 3, 3, 4, 10};
        int[] badValues =  {1, 2, 2, 2, 3, 5, 10};
        for (int i = 0; i < bad.length; i++) {
            try{
                good[i] = goodValues[i] * good[i];
            }catch (Exception e){
                //
            }
            bad[i] = badValues[i] * bad[i];
        }
        int sumGood = Arrays.stream(good).reduce(0, Integer::sum);
        int sumBad = Arrays.stream(bad).reduce(0, Integer::sum);
        if (sumGood!=sumBad)
            return (sumGood > sumBad) ? "Battle Result: Good triumphs over Evil" : "Battle Result: Evil eradicates all trace of Good";
        return "Battle Result: No victor on this battle field";
    }
}

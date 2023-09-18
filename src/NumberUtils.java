import java.lang.Math;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        //converts the number into a list
        String numberString = Integer.toString(number);
        int ArmstrongNumber = 0;
        //goes through every digit in the number
        for (int i = 0; i < numberString.length(); i++)
        {
            int nm = Character.getNumericValue(numberString.charAt(i));
            ArmstrongNumber += (int)Math.pow(nm,numberString.length());
        }
        return ArmstrongNumber == number;
    }
}
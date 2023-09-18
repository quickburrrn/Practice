import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        for(int i=0; i<array.length;i++)
        {
            //finds the odd numbers
            if (array[i] % 2 == 1)
            {
                //places where the number belongs
                for(int j=0; j<array.length;j++)
                {
                    if (array[j] % 2 == 1)
                    {
                        if (array[i]<=array[j])
                        {
                            int newNumber = array[i];
                            int oldNumber = array[j];
                            array[i] = oldNumber;
                            array[j] = newNumber;
                        }
                    }
                }
            }
        }
        return array;
    }
}

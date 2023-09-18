import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildTower {
    public static String[] towerBuilder(int nFloors)
    {
        int size = nFloors*2-1;
        String[][] Tower = new String[nFloors][size];
        for(int i = 0; i<nFloors; i++)
        {
            for(int j = 0; j<size; j++)
            {
                Tower[i][j] = " ";
            }
            Tower[i][(size-1)/2] = "*";
            //places * in the middle
            for (int l = 0; l<i+1; l++)
            {
                Tower[i][((size-1)/2)+l] = "*";
                Tower[i][((size-1)/2)-l] = "*";
            }
        }
        //convert the matrix onto string[]
        String[] tower = new String[nFloors];
        for (int x = 0; x<nFloors; x++)
        {
            tower[x] = String.join("",Tower[x]);
        }
        return tower;
    }
}

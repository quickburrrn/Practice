import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Sum sum = new Sum();

        //mine sweeper 1kyu
        /*
        String[] map = {"Simple map 1",
                "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1",
                "? ? ? ? ? ?\n? ? ? ? ? ?\n? ? ? 0 ? ?\n? ? ? ? ? ?\n? ? ? ? ? ?\n0 0 0 ? ? ?",
                "1 x 1 1 x 1\n2 2 2 1 2 2\n2 x 2 0 1 x\n2 x 2 1 2 2\n1 1 1 1 x 1\n0 0 0 1 1 1"};
        new MineSweeper(map[2],6);

         */

        //Build Tower 6kyu
        String[] Building = BuildTower.towerBuilder(100);
        for (String b : Building)
        {
            System.out.println(b);
        }

        //Sort The Odd 6kyu
        //SortTheOdd.sortArray(new int[] {9,8,7,6,5,4,3,2,1,0});

        //Narcissistic Number 7kyu
        //System.out.println(NumberUtils.isNarcissistic(153));

        //Sum 7kyu
        //System.out.println(sum.GetSum(1, 2  ));
    }
}
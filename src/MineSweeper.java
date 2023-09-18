import java.util.Arrays;
import java.util.Objects;

class MineSweeper {

    //i shall go back to this
    public MineSweeper(final String board, final int nMines) {
        System.out.println(open(2,5));
    }

    public String solve() {
        // Your code here...
        return "";
    }

    //this function is not going to get used when uploading
    public int open(int row, int column)
    {
        //decompiles map. this function will not be in the code
        String[][] map = {
                {"1","x","1","1","x","1"},
                {"2","2","2","1","2","2"},
                {"2","x","2","0","1","x"},
                {"2","x","2","1","2","2"},
                {"1","1","1","1","x","1"},
                {"0","0","0","1","1","1"}};

        //this is how i debug the map
        //for (int i = 0; i<map.length; i++) {
        //    System.out.println(Arrays.toString(map[i]));
        //}

        //string of all the 8 direction it will search
        int[][] directions = {{1,0},{1,1},{0,1},{-1, 1},{0,-1},{-1,-1},{-1,0},{1,-1}};

        //the value that are returned
        int mines = 0;

        //check if it is a mine
        if (map[row][column].equals("x")){
            System.out.println("boom");
        }

        //minds the mines
        for (int[] direction : directions)
        {
            int y = row+direction[0];
            int x = column+direction[1];

            if (x>=0 && x<map[0].length)
            {
                if (y>=0 && y<map.length)
                {
                    if (map[y][x].equals("x")) {
                        mines++;
                    }
                }
            }
            //System.out.println(map[row+direction[0]][column+direction[1]]);
        }

        return mines;
    }
}
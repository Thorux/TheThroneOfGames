package Data;

import org.lwjgl.opengl.Display;

import static Helpers.Artists.BeginSession;

/**
 * Created by Anders on 21-02-2015.
 */
public class Boot {
    //public static int row, col;
    //public static Scanner scan = new Scanner(System.in);
    //public static int[][] board = new int[6][7];
    //public static int turn = 2;

    public Boot() {

        int[][] board = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1},
        };

        BeginSession();
        TileGrid grid = new TileGrid(board);
        Player player = new Player(grid);

        while (!Display.isCloseRequested()) {
            grid.Draw();
            player.Update();

            Display.update();
            Display.sync(60);
        }

        Display.destroy();
    }

    public static void main(String[] args) {

        new Boot();

        //PrintBoard();
        //Play();
    }

    /*public static void Play() {
        boolean playing = true;
        PrintBoard();

        while (playing) {
            System.out.println("Please enter a row and a column: ");
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            board[row][col] = turn;
                /*
                * if (GameOver(row, col)) {
                * playing = false;
                * System.out.println("Game over! Player " + turn + " wins!");
                * }
                * */
           /* PrintBoard();
            if (turn == 2) {
                turn = 5;
            } else {
                turn = 2;
            }
        }
    }

    public static void PrintBoard() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " | ");

            }
        }
        System.out.println();

    }

    public static boolean GameOver(int rMove, int cMove) {


        return false;
    }*/


}

package Data;

import static Helpers.Artists.DrawQuadTex;

/**
 * Created by Kristian on 21/02/2015 at 05:38.
 */
public class TileGrid {
    public Tile[][] board;

    public TileGrid(int[][] newBoard) {
        board = new Tile[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                switch (newBoard[j][i]) {
                    case -1:
                        board[i][j] = new Tile(i * 128, j * 128, 128, 128, TileType.BG);
                        break;

                    case 0:
                        board[i][j] = new Tile(i * 128, j * 128, 128, 128, TileType.Board);
                        break;

                    case 2:
                        board[i][j] = new Tile(i * 128, j * 128, 128, 128, TileType.Blue);
                        break;

                    case 5:
                        board[i][j] = new Tile(i * 128, j * 128, 128, 128, TileType.White);
                        break;
                }
            }
        }
    }

    public void SetTile(int xCoord, int yCoord, TileType type) {
        board[xCoord][yCoord] = new Tile(xCoord * 128, yCoord * 128, 128, 128, type);
    }

    public Tile GetTile(int xCoord, int yCoord) {
        return board[xCoord][yCoord];
    }
    
    public void Draw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                Tile t = board[i][j];
                DrawQuadTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
            }
        }
    }


}

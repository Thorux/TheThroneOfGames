package Data;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import static Helpers.Artists.HEIGHT;

/**
 * Created by Kristian on 21/02/2015 at 06:41.
 */
public class Player {

    public TileGrid grid;
    public TileType[] types;
    public int index;

    public Player(TileGrid grid) {
        this.grid = grid;
        this.types = new TileType[2];
        this.types[0] = TileType.Blue;
        this.types[1] = TileType.White;
        this.index = 0;

    }

    public void SetTile() {
        grid.SetTile((int) Math.floor(Mouse.getX() / 128), (int) Math.floor((HEIGHT - Mouse.getY() - 1) / 128), types[index]);
    }

    public void Update() {
        if (Mouse.isButtonDown(0)) {
            SetTile();
        }

        while (Keyboard.next()) {
            if (Keyboard.getEventKey() == Keyboard.KEY_1 && Keyboard.getEventKeyState()) {
                MoveIndex();
            }
        }
    }

    private void MoveIndex() {
        index++;
        if(index > types.length - 1) {
            index = 0;
        }
    }
}

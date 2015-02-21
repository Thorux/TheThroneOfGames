package Helpers;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created by Kristian on 21/02/2015 at 03:54.
 */
public class Artists {

    public static final int WIDTH = 896, HEIGHT = 768;

    public static void BeginSession() {
        Display.setTitle("Whatever main!");
        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, WIDTH, HEIGHT, 0, -1, 1);
        glMatrixMode(GL_MODELVIEW);


        while(!Display.isCloseRequested()) {
            Display.update();
            Display.sync(60);
        }
        Display.destroy();

    }

    public static Texture LoadTexture(String path, String fileType) {
        Texture tex = null;
        InputStream in = ResourceLoader.getResourceAsStream(path);
        try {
            tex = TextureLoader.getTexture(fileType, in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tex;
    }

    public static Texture QuickLoad(String name) {
        Texture tex = null;
        tex = LoadTexture("res/" + name + ".png", "PNG");
        return tex;
    }
}

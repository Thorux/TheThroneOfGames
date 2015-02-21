package Helpers;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created by Kristian on 21/02/2015 at 03:54.
 */
public class Artists {

    public static final int WIDTH = 800, HEIGHT = 600;

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
}

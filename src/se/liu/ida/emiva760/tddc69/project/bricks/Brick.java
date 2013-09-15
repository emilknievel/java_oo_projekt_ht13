package se.liu.ida.emiva760.tddc69.project.bricks;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.net.URL;

public class Brick extends Point2D.Double {
    /**
     * The path to the sprite (relative to /bin)
     */
    protected String spriteFileName;
    private int width;
    private int height;

    public Brick(double x, double y) {
        super(x, y);

        /**
         * Loads the sprite from the path variable
         */
        URL spriteUrl = getClass().getResource(spriteFileName);

        ImageIcon icon = null;
        if (spriteUrl != null) {
            icon =  new ImageIcon(spriteUrl);
        } else {
            System.err.println("Couldn't find file: " + spriteFileName);
        }
        /*
         A BufferedImage object
        */
	Image sprite = icon.getImage();

        width = sprite.getWidth(null);
        height = sprite.getHeight(null);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

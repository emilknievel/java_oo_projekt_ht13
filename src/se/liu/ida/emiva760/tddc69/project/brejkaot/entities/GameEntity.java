package se.liu.ida.emiva760.tddc69.project.brejkaot.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.net.URL;

public abstract class GameEntity extends Point2D.Double {
    // The path to the sprite
    protected String spriteFileName;

    private int width;
    private int height;
    private Image sprite;

    public GameEntity(double x, double y) {
        super(x, y);
    }

    /**
     * Loads the sprite pointed to by spriteFileName
     */
    public void loadSprite() {
	// Loads sprite URL from the path variable
	URL spriteUrl = getClass().getResource("resources/" + spriteFileName);

	ImageIcon icon = null;
	if (spriteUrl != null) {
	    icon =  new ImageIcon(spriteUrl);
	} else {
	    System.err.println("Couldn't find file: " + spriteFileName);
	}

	// A BufferedImage object
	sprite = icon.getImage();

	width = sprite.getWidth(null);
	height = sprite.getHeight(null);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Image getImage() {
	return sprite;
    }
}

package se.liu.ida.emiva760.tddc69.project.entities.bricks;

import se.liu.ida.emiva760.tddc69.project.entities.GameEntity;

public class BlueBrick extends GameEntity
{

    public BlueBrick(double x, double y) {
        super(x, y);
	spriteFileName = "/resources/bluebrick.png";
	loadSprite();
    }
}

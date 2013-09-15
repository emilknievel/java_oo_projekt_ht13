package se.liu.ida.emiva760.tddc69.project.gameboard;

import se.liu.ida.emiva760.tddc69.project.bricks.BlueBrick;
import se.liu.ida.emiva760.tddc69.project.bricks.Brick;

import javax.swing.*;

public class Test extends JFrame {
    public Test()
    {
        setTitle("Breakout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Test();
	BlueBrick brick = new BlueBrick(4,5);
    }
}

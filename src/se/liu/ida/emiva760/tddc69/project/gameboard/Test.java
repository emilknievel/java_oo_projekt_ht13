package se.liu.ida.emiva760.tddc69.project.gameboard;

import javax.swing.*;

public class Test extends JFrame {
    public Test()
    {
	add(new GameBoard());
        setTitle("Breakout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}

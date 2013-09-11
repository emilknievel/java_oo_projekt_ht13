package se.liu.ida.emiva760.tddc69.project.gameboard;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Emil
 * Date: 2013-09-05
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
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
    }
}

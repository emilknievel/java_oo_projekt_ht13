package se.liu.ida.emiva760.tddc69.project.brejkaot;

import javax.swing.*;

public class Brejkaot extends JFrame {
    public Brejkaot()
    {
	add(new BrejkaotManager());
        setTitle("Breakout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Brejkaot();
    }
}

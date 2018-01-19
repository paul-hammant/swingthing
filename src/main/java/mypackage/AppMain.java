package mypackage;

import javax.swing.*;
import java.awt.*;

public class AppMain {
    public static void main(String args[]) {
        Runnable runner = new Runnable() {
            public void run() {
                JFrame frame = new MyFrame(new ClickListener() {
                    public void thatButtonWasClicked() {
                        System.out.println("I was selected.");
                    }
                });
            }
        };
        EventQueue.invokeLater(runner);
    }
}
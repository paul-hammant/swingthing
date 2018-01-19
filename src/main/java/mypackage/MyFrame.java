package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public MyFrame(final ClickListener listener) throws HeadlessException {
        super("Button Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Select Me");
        // Define ActionListener
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                listener.thatButtonWasClicked();
            }
        };
        // Attach listeners
        button.addActionListener(actionListener);
        add(button, BorderLayout.SOUTH);
        setSize(300, 100);
        setVisible(true);
    }
}

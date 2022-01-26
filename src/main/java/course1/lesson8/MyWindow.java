package course1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,500,500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        });
//        JButton button1 = new JButton("Button 1");
//        JButton button2 = new JButton("Button 2");
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        for (int i = 0; i <= 10; i++) {
//            JButton button = new JButton("#" + i);
//            add(button);
//        }
//        setLayout(new FlowLayout());
//        for (int i = 0; i <= 10 ; i++) {
//            JButton button = new JButton("#" + i);
//            add(button);
//        }
//        setLayout(new GridLayout(3,3));
//        for (int i = 0; i < 10 ; i++) {
//            JButton button = new JButton("#" + i);
//            add(button);
//        }
        setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(20,20,120,30);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);
        JButton button = new JButton("Click me");
        button.setBounds(20, 60, 120,30);
        add(button);
        button.addActionListener(actionEvent -> textField.setText("Button pressed"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}

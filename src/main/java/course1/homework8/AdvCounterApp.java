package course1.homework8;

import javax.swing.*;
import java.awt.*;

public class AdvCounterApp extends JFrame{
    private int value;
    private final JLabel label, infoRange;

    public AdvCounterApp() {
        setTitle("Test Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setResizable(false);
        setBounds(500,500,500,150);
        Font font = new Font("Arial", Font.BOLD, 32);
        JPanel decreasePanel = new JPanel(new BorderLayout());
        add(decreasePanel, BorderLayout.WEST);
        JButton decDecimalButton = new JButton("<<");
        decDecimalButton.setFont(font);
        decreasePanel.add(decDecimalButton, BorderLayout.WEST);
        JButton decUnitButton = new JButton("<");
        decUnitButton.setFont(font);
        decreasePanel.add(decUnitButton, BorderLayout.EAST);
        label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        JPanel increasePanel = new JPanel(new BorderLayout());
        add(increasePanel, BorderLayout.EAST);
        JButton incDecimalButton = new JButton(">>");
        incDecimalButton.setFont(font);
        increasePanel.add(incDecimalButton, BorderLayout.EAST);
        JButton incUnitButton = new JButton(">");
        incUnitButton.setFont(font);
        increasePanel.add(incUnitButton, BorderLayout.WEST);
        infoRange = new JLabel();
        infoRange.setHorizontalAlignment(SwingConstants.CENTER);
        infoRange.setFont(font);
        infoRange.setForeground(Color.RED);
        add(infoRange, BorderLayout.NORTH);

        decDecimalButton.addActionListener(actionEvent -> {
            value -= 10;
            setValue();
        });
        decUnitButton.addActionListener(actionEvent -> {
            value--;
            setValue();
        });
        incUnitButton.addActionListener(actionEvent -> {
            value++;
            setValue();
        });
        incDecimalButton.addActionListener(actionEvent -> {
            value += 10;
            setValue();
        });

        setVisible(true);
    }

    private void setValue() {
        label.setText(String.valueOf(value));
        validateRange();
    }

    private void validateRange() {
        if (Math.abs(value) > 100) {
            infoRange.setText("Value out of range!");
        } else {
            infoRange.setText("");
        }
    }


    public static void main(String[] args) {
        new AdvCounterApp();
    }

}

package hnu.progtech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_1 extends JFrame {
    private JTextField textField1;
    private JButton btBerechne;
    private JTextField textField2;
    private JPanel myPanel;
    private JTextArea textArea1;

    public GUI_1()  {
        setTitle("Test Fenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setContentPane(myPanel);
        setVisible(true);
        btBerechne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText("1");
            }
        });
    }

    public static void main(String[] args) {
        new GUI_1();
    }
}

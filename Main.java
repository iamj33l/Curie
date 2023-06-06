package org.curie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        String system = "Curie: ";
        String command;
        String text;

        JVoice v = new JVoice();

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        JFrame frame = new JFrame("Curie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.BLACK);
        Font f1 = new Font("Product Sans", Font.PLAIN, 14);
        frame.setFont(f1);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        Font f3 = new Font("Inter", Font.PLAIN, 16);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 10, 465, 588);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setFont(f3);
        textArea.setText("\nClick on speak button to give Instruction.\n");

        JButton button = new JButton("Speak");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setBounds(187, 610, 110, 40);
        Font f2 = new Font("Product Sans", Font.PLAIN, 20);
        button.setFont(f2);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JVoice v = new JVoice();
                    Curie c = new Curie();

                    String command = v.listen();
                    textArea.append("\n-> User : " + command + "\n");
                    textArea.append("-> Curie : " + c.curie(command) + "\n");

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        c.add(button);
        c.add(textArea);
        button.setFocusable(false);
        frame.setVisible(true);
    }
}
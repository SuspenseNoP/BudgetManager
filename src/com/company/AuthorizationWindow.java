package com.company;

import javax.swing.*;
import java.awt.*;

public class AuthorizationWindow {
    public void init() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 150, 300);
        frame.setTitle("Authorization");

        panel.setBackground(Color.black);
        JButton SubmitButton = new JButton("Submit");
        SubmitButton.setLocation(20, 150);
        SubmitButton.setSize(100, 60);

        SubmitButton.setBackground(Color.darkGray);
        SubmitButton.setForeground(Color.LIGHT_GRAY);
        panel.add(SubmitButton);

        JTextField name = new JTextField();
        JTextField password = new JTextField();

        name.setLocation(20, 30);
        name.setSize(100,30);

        password.setLocation(20, 90);
        password.setSize(100,30);

        panel.add(name);
        panel.add(password);

        SubmitButton.addActionListener(e -> {

            frame.dispose();

            MenuWindow menuWindow = new MenuWindow();
            menuWindow.init();
        });


        frame.setVisible(true);
        frame.setContentPane(panel);
    }
}

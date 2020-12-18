package com.company;

import javax.swing.*;
import java.awt.*;

public class MenuWindow {
    public void init(){




        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 270, 200);
        frame.setTitle("Authorization");

        panel.setBackground(Color.black);

        JButton AccountButton = new JButton("Account Edit");
        AccountButton.setLocation(20, 20);
        AccountButton.setSize(100, 50);

        AccountButton.setBackground(Color.darkGray);
        AccountButton.setForeground(Color.LIGHT_GRAY);
        panel.add(AccountButton);


        AccountButton.addActionListener(e -> {

            frame.dispose();

            AccountWindow accountWindow = new AccountWindow();
            accountWindow.init();
        });

        JButton GraphicButton = new JButton("Diagram");
        GraphicButton.setLocation(140, 20);
        GraphicButton.setSize(100, 50);

        GraphicButton.setBackground(Color.darkGray);
        GraphicButton.setForeground(Color.LIGHT_GRAY);
        panel.add(GraphicButton);


        GraphicButton.addActionListener(e -> {

            frame.dispose();
            GraphicWindow graphicWindow = new GraphicWindow();
            graphicWindow.init();

        });

        JButton OperationButton = new JButton("Operation");
        OperationButton.setLocation(20, 90);
        OperationButton.setSize(100, 50);

        OperationButton.setBackground(Color.darkGray);
        OperationButton.setForeground(Color.LIGHT_GRAY);
        panel.add(OperationButton);


        OperationButton.addActionListener(e -> {

            frame.dispose();
            OperationWindow operationWindow = new OperationWindow();
            operationWindow.init();

        });

        JButton TypeButton = new JButton("Type Edit");
        TypeButton.setLocation(140, 90);
        TypeButton.setSize(100, 50);

        TypeButton.setBackground(Color.darkGray);
        TypeButton.setForeground(Color.LIGHT_GRAY);
        panel.add(TypeButton);


        TypeButton.addActionListener(e -> {

            frame.dispose();

            TypeWindow typeWindow = new TypeWindow();
            typeWindow.init();
        });


        frame.setVisible(true);
        frame.setContentPane(panel);
    }

    public void viewIncomeTypes(Account account){}
    public void viewSpendingTypes(Account account){}
    public void viewBillTypes(Account account){}
    public void exit(){}

}

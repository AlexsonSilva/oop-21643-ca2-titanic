package com.company;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Menu menu = new Menu();
               menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               menu.setVisible(true);
               menu.setSize(460,500);

            }
        });

    }
}

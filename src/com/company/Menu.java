package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private final JLabel titleLabel;
    private final JLabel nameLabel;
    private final JButton nameButton;
    private getSourceByName getByName;
    private final JLabel genderLabel;
    private final JButton genderButton;
    private getSourceByGender getByGender;
    private final JLabel ageLabel;
    private final JButton ageButton;
    private getSourceByAge getByAge;
    private final JLabel nameGenderLabel;
    private final JButton nameGenderButton;
    private getSourceByNameGender getByNameGender;



    public Menu(){
        super("Titanic Manifest");


        JPanel panel1 = new JPanel();
        setLayout(null);
        Insets insets = panel1.getInsets();
        Dimension dimension = panel1.getPreferredSize();
        panel1.setBounds(0 + insets.left, 0 + insets.top,
                460, 276);
       // panel1.setSize(700,100);
        add(panel1);

        ImageIcon img = new ImageIcon(getClass().getResource("Titanic.jpg"));
        setLayout(null);
        JLabel label = new JLabel(img);
        insets = label.getInsets();
        dimension = label.getPreferredSize();
        label.setBounds(0 + insets.left, 0 + insets.top,
                dimension.width, dimension.height);
        panel1.add(label);

        JPanel panel2 = new JPanel();
        //setLayout(null);
        panel2.setBackground(Color.gray);
        insets = panel2.getInsets();
        dimension = panel2.getPreferredSize();
        panel2.setBounds(0 + insets.left, 276 + insets.top,
                460, 250);
        //panel2.setSize(700, 300);
        add(panel2);

        titleLabel = new JLabel("Search for data by:");
        setLayout(null);
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        insets = titleLabel.getInsets();
        dimension = titleLabel.getPreferredSize();
        titleLabel.setBounds(140 + insets.left, 280 + insets.top,
                dimension.width, dimension.height);
        add(titleLabel);
        add(panel2);

        nameLabel = new JLabel("Name");
        setLayout(null);
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        insets = nameLabel.getInsets();
        dimension = nameLabel.getPreferredSize();
        nameLabel.setBounds(25 + insets.left, 335 + insets.top,
                dimension.width, dimension.height);
        add(nameLabel);
        add(panel2);

        nameButton = new JButton("Search");
        setLayout(null);
        insets = nameButton.getInsets();
        dimension = nameButton.getPreferredSize();
        nameButton.setBounds(150 + insets.left, 330 + insets.top,
                dimension.width, dimension.height);
        add(nameButton);
        add(panel2);

        genderLabel = new JLabel("Gender");
        setLayout(null);
        genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        insets = genderLabel.getInsets();
        dimension = genderLabel.getPreferredSize();
        genderLabel.setBounds(25 + insets.left, 365 + insets.top,
                dimension.width, dimension.height);
        add(genderLabel);
        add(panel2);

        genderButton = new JButton("Search");
        setLayout(null);
        insets = genderButton.getInsets();
        dimension = genderButton.getPreferredSize();
        genderButton.setBounds(150 + insets.left, 360 + insets.top,
                dimension.width, dimension.height);
        add(genderButton);
        add(panel2);

        ageLabel = new JLabel("Age");
        setLayout(null);
        ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        insets = ageLabel.getInsets();
        dimension = ageLabel.getPreferredSize();
        ageLabel.setBounds(25 + insets.left, 395 + insets.top,
                dimension.width, dimension.height);
        add(ageLabel);
        add(panel2);

        ageButton = new JButton("Search");
        setLayout(null);
        insets = ageButton.getInsets();
        dimension = ageButton.getPreferredSize();
        ageButton.setBounds(150 + insets.left, 390 + insets.top,
                dimension.width, dimension.height);
        add(ageButton);
        add(panel2);

        nameGenderLabel = new JLabel("Name and Gender");
        setLayout(null);
        nameGenderLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        insets = nameGenderLabel.getInsets();
        dimension = nameGenderLabel.getPreferredSize();
        nameGenderLabel.setBounds(25 + insets.left, 425 + insets.top,
                dimension.width, dimension.height);
        add(nameGenderLabel);
        add(panel2);

        nameGenderButton = new JButton("Search");
        setLayout(null);
        insets = nameGenderButton.getInsets();
        dimension = nameGenderButton.getPreferredSize();
        nameGenderButton.setBounds(150 + insets.left, 420 + insets.top,
                dimension.width, dimension.height);
        add(nameGenderButton);
        add(panel2);


        getByName = new getSourceByName();
        nameButton.addActionListener(getByName);

        getByGender = new getSourceByGender();
        genderButton.addActionListener(getByGender);

        getByAge = new getSourceByAge();
        ageButton.addActionListener(getByAge);

        getByNameGender = new getSourceByNameGender();
        nameGenderButton.addActionListener(getByNameGender);

    }
    private class getSourceByName implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new TitanicListing().returnName();

        }

    }

    private class getSourceByGender implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new TitanicListing().returnGender();

        }

    }

    private class getSourceByAge implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new TitanicListing().returnAge();

        }

    }


    private class getSourceByNameGender implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new TitanicListing().returnNameGender();

        }

    }

}

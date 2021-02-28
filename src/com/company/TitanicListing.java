package com.company;

import com.company.models.Passenger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;

public class TitanicListing extends JFrame {

    public TitanicListing() {

    }
    public void returnName(){
            String[] columns = new String[]{
                    "name", "gender", "age"
            };

            DefaultTableModel model = new DefaultTableModel();

            model.setColumnIdentifiers(columns);

            JTable table = new JTable(model);

            TitanicQueries tq = new TitanicQueries();
            List<Passenger> passengers = tq.getPassengersByName("james");

            for(Passenger p : passengers) {

                model.addRow(new Object[]{p.name, p.gender, p.age});
            }

            this.add(new JScrollPane(table));
            this.pack();
            this.setVisible(true);
    }

    public void returnGender(){
        String[] columns = new String[]{
                "name", "gender", "age"
        };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        JTable table = new JTable(model);

        TitanicQueries tq = new TitanicQueries();
        List<Passenger> passengers = tq.getPassengersByGender("female");

        for(Passenger p : passengers) {

            model.addRow(new Object[]{p.name, p.gender, p.age});
        }

        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    public void returnAge(){
        String[] columns = new String[]{
                "name", "gender", "age"
        };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        JTable table = new JTable(model);

        TitanicQueries tq = new TitanicQueries();
        List<Passenger> passengers = tq.getPassengersByAge("71");

        for(Passenger p : passengers) {

            model.addRow(new Object[]{p.name, p.gender, p.age});
        }

        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    public void returnNameGender(){
        String[] columns = new String[]{
                "name", "gender", "age"
        };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        JTable table = new JTable(model);

        TitanicQueries tq = new TitanicQueries();
        List<Passenger> passengers = tq.getPassengersByNameGender("michael", "male");

        for (Passenger p : passengers){
            model.addRow(new Object[]{p.name, p.gender, p.age});
        }

        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

}

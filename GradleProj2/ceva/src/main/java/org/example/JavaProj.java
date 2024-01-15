package org.example;

// Java program to illustrate the GridLayout

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JavaProj extends JFrame {

    JavaProj() {

        setResizable(false);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(11, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel lMarca, lModel, lAnFabr, lEmpty, lEmptyTwo, lEmptyThree, lDataInc, lDataFinal, lNume, lPrenume;
        JTextField fMarca, fModel, fAnFabr, fDataInc, fDataFinal, fNume, fPrenume;
        JButton btnSave, btnExit;
        JRadioButton rdBenzina, rdMotorina;
        JCheckBox chInchiriat;
        //JTable tTabelMasini;
        lEmpty = new JLabel("");
        lEmptyTwo = new JLabel("");
        lEmptyThree = new JLabel("");
        lMarca = new JLabel("Marca:");
        fMarca = new JTextField(20);
        lModel = new JLabel("Model:");
        fModel = new JTextField(20);
        lAnFabr = new JLabel("An fabricatie:");
        fAnFabr = new JTextField(20);
        btnSave = new JButton("Salvare");
        btnExit = new JButton("Anulare");
        rdBenzina = new JRadioButton("Benzina");
        rdMotorina = new JRadioButton("Motorina");
        chInchiriat = new JCheckBox("Inchiriat?");
        lNume = new JLabel("Nume:");
        fNume = new JTextField(20);
        lPrenume = new JLabel("Prenume:");
        fPrenume = new JTextField(20);
        lDataInc = new JLabel("Inchiriat la:");
        fDataInc = new JTextField(20);
        lDataFinal = new JLabel("Sfarsitul inchirierii:");
        fDataFinal = new JTextField(20);
        //tTabelMasini = new JTable();
        p1.add(lMarca);
        p1.add(fMarca);
        p1.add(lModel);
        p1.add(fModel);
        p1.add(lAnFabr);
        p1.add(fAnFabr);
        p1.add(rdBenzina);
        p1.add(rdMotorina);
        p1.add(lEmptyTwo);
        p1.add(lEmptyThree);
        p1.add(chInchiriat);
        p1.add(lEmpty);
        p1.add(lNume);
        p1.add(fNume);
        p1.add(lPrenume);
        p1.add(fPrenume);
        p1.add(lDataInc);
        p1.add(fDataInc);
        p1.add(lDataFinal);
        p1.add(fDataFinal);
        //p1.add(tTabelMasini);
        lNume.setEnabled(false);
        fNume.setEnabled(false);
        lPrenume.setEnabled(false);
        fPrenume.setEnabled(false);
        lDataInc.setEnabled(false);
        lDataFinal.setEnabled(false);
        fDataInc.setEnabled(false);
        fDataFinal.setEnabled(false);
        rdBenzina.setSelected(true);
        rdBenzina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdBenzina.isSelected()) {
                    rdMotorina.setSelected(false);
                }
                if(!rdBenzina.isSelected()) {
                    rdBenzina.setSelected(true);
                }
            }
        });
        rdMotorina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdMotorina.isSelected()) {
                    rdBenzina.setSelected(false);
                }
                if(!rdMotorina.isSelected()) {
                    rdMotorina.setSelected(true);
                }
            }
        });
        chInchiriat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(chInchiriat.isSelected()) {
                    lNume.setEnabled(true);
                    fNume.setEnabled(true);
                    lPrenume.setEnabled(true);
                    fPrenume.setEnabled(true);
                    lDataInc.setEnabled(true);
                    lDataFinal.setEnabled(true);
                    fDataInc.setEnabled(true);
                    fDataFinal.setEnabled(true);
                }
                if(!chInchiriat.isSelected()) {
                    lNume.setEnabled(false);
                    lPrenume.setEnabled(false);
                    lDataInc.setEnabled(false);
                    lDataFinal.setEnabled(false);
                    fDataInc.setEnabled(false);
                    fDataInc.setText("");
                    fDataFinal.setEnabled(false);
                    fDataFinal.setText("");
                    fNume.setEnabled(false);
                    fNume.setText("");
                    fPrenume.setEnabled(false);
                    fPrenume.setText("");
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Va rog sa folositi butonul \"" + btnExit.getText() + "\" pentru a iesi");
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //System.exit(0);
            }
        });
        //=========================================================
        p2.add(btnSave);
        p2.add(btnExit);
        add(p1, "North");
        add(p2, "South");
        setVisible(true);
        this.setSize(500, 350);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnExit.isEnabled()) {
                    System.exit(0);
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    Car masina = new Car();
                    masina.setMarca(fMarca.getText());
                    masina.setModel(fModel.getText());
                    masina.setAnFabr(fAnFabr.getText());
                    masina.setTipCombustibil(rdMotorina.isSelected());
                    masina.setInchiriat(chInchiriat.isSelected());
                    masina.setStartInchiriere(fDataInc.getText());
                    masina.setEndInchiriere(fDataFinal.getText());
                    masina.setNume(fNume.getText());
                    masina.setPrenume(fPrenume.getText());
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Executat cu succes!");
                    ObjectMapper mapper = new ObjectMapper();
                    String showJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(masina);
                    String jsonString = mapper.writeValueAsString(masina);
                    System.out.println(showJson);
                    System.out.println("Se rescrie din JSON in obiect (DEBUG): ");
                    Car masinaHelp = mapper.readValue(jsonString, Car.class);
                    FileWriter myWriter = new FileWriter("proba.txt");
                    myWriter.write(jsonString);
                    myWriter.close();
                }
                catch (IOException f){
                    System.out.println("S-a produs o eroare. Executia programului se va opri.");
                    f.printStackTrace();
                }
                //DEBUG JOptionPane.showMessageDialog(null, masina.getMarca());
            }
        });
    }

    // Main Method

    public static void main(String[] args) {
        new JavaProj();
    }

}
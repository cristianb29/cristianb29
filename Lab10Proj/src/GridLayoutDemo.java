// Java program to illustrate the GridLayout 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// class GridLayout extends JFrame 


public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {
        setResizable(false);
        //================================================
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(7, 2));

        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel one, two, three, four;
        JTextField fNume, fCnp, fFunctie, fSalar;
        JButton buttonSave, buttonExit;
        JRadioButton cs1, cs2;
        one = new JLabel("Nume:");
        fNume = new JTextField(20);
        two = new JLabel("CNP:");
        fCnp = new JTextField(20);
        three = new JLabel("Functia:");
        fFunctie = new JTextField(20);
        four = new JLabel("Salar:");
        fSalar = new JTextField(20);
        buttonSave = new JButton("Salvare");
        buttonExit = new JButton("Anulare");
        cs1 = new JRadioButton("Barbat");
        cs2 = new JRadioButton("Femeie");
        p1.add(one);
        p1.add(fNume);
        p1.add(two);
        p1.add(fCnp);
        p1.add(three);
        p1.add(fFunctie);
        p1.add(four);
        p1.add(fSalar);
        p1.add(cs1);
        p1.add(cs2);
        cs1.setSelected(true);
        cs1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(cs1.isSelected()) {
                        cs2.setSelected(false);
                    }
                    if(!cs1.isSelected()) {
                        cs1.setSelected(true);
                    }
        }
        });
        cs2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cs2.isSelected()) {
                    cs1.setSelected(false);
                }
                if(!cs2.isSelected()) {
                    cs2.setSelected(true);
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Va rog sa folositi butonul \"" + buttonExit.getText() + "\" pentru a iesi");
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //System.exit(0);
            }
        });
        //=========================================================
        p2.add(buttonSave);
        p2.add(buttonExit);
        add(p1, "North");
        add(p2, "South");
        setVisible(true);
        this.setSize(500, 400);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonExit.isEnabled()) {
                    System.exit(0);
                }
            }
        });
    }

    // Main Method 
    public static void main(String args[])
    {
        new GridLayoutDemo();
    }

} 
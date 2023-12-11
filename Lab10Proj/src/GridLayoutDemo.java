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
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Va rog sa folositi butonul \"EXIT\" pentru a iesi");
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //System.exit(0);
            }
        });
        setResizable(false);
        //================================================
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(7, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel one, two, three, four;
        JTextField tname, tsalary, tcode, tdesig;
        JButton buttonSave, buttonExit;
        JCheckBox cs1, cs2, cs3;
        one = new JLabel("NAME");
        tname = new JTextField(20);
        two = new JLabel("CODE");
        tcode = new JTextField(20);
        three = new JLabel("DESIGNATION");
        tdesig = new JTextField(20);
        four = new JLabel("SALARY");
        tsalary = new JTextField(20);
        buttonSave = new JButton("SAVE");
        buttonExit = new JButton("EXIT");
        cs1 = new JCheckBox("Casuta 1");
        cs2 = new JCheckBox("Casuta 2");
        cs3 = new JCheckBox("Casuta 3");
        p1.add(one);
        p1.add(tname);
        p1.add(two);
        p1.add(tcode);
        p1.add(three);
        p1.add(tdesig);
        p1.add(four);
        p1.add(tsalary);
        p1.add(cs1);
        p1.add(cs2);
        //=========================================================
        p2.add(buttonSave);
        p2.add(buttonExit);
        add(p1, "North");
        add(p2, "South");
        setVisible(true);
        this.setSize(500, 400);
        buttonExit.addActionListener(new ActionListener() {
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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showLabelDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Titlu aplicatie");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(4, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                //Toolkit.getDefaultToolkit().beep();
                //mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showLabelDemo() {
        headerLabel.setText("R1C1");
        JLabel label = new JLabel("", JLabel.CENTER);
        JButton submit = new JButton("Ok");
        label.setText("R3C1");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setForeground(Color.BLACK);
        controlPanel.add(label);
        controlPanel.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (submit.isEnabled()) {
                    String sampleMsg = "Mesaj";
                    JOptionPane.showMessageDialog(null, sampleMsg);
                }
                if (!submit.isEnabled()) {
                    System.out.println("Add Button is not pressed");
                }
            }
        });
        mainFrame.setVisible(true);
    }
}

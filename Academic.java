package Lab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Academic {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("IIT");

        // Create OK button
        JButton btnOK = new JButton("For Student");

        btnOK.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {

                        JFrame f=new JFrame("Authentication required");
                        final JLabel label = new JLabel();
                        label.setBounds(20,150, 200,50);
                        final JPasswordField value = new JPasswordField();
                        value.setBounds(100,75,100,30);
                        JLabel l1=new JLabel("Username:");
                        l1.setBounds(20,20, 80,30);
                        JLabel l2=new JLabel("Password:");
                        l2.setBounds(20,75, 80,30);
                        JButton b = new JButton("Login");
                        b.setBounds(100,120, 80,30);
                        final JTextField text = new JTextField();
                        text.setBounds(100,20, 100,30);
                        f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);
                        f.setSize(300,300);
                        f.setLayout(null);
                        f.setVisible(true);
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame f=new JFrame("enter personal details");
                                final JLabel label = new JLabel();
                                label.setBounds(20,150, 200,50);
                                final JTextField value = new JTextField();
                                value.setBounds(100,75,100,30);
                                JLabel l1=new JLabel("full name:");
                                l1.setBounds(20,20, 80,30);
                                JLabel l2=new JLabel("father's name:");
                                l2.setBounds(20,75, 80,30);
                                final JLabel label1 = new JLabel();
                                label1.setBounds(20,290, 200,50);
                                final JTextField value1 = new JTextField();
                                value1.setBounds(100,145,100,30);
                                JLabel l3=new JLabel("address:");
                                l3.setBounds(20,145, 80,30);
                                JButton b = new JButton("Login");
                                b.setBounds(100,200, 80,30);
                                JTextField text1 = new JTextField();
                                text1.setBounds(100,20, 100,30);


                                f.add(value); f.add(l1);f.add(label); f.add(l2);
                               f.add(value1);f.add(l3);f.add(label1);f.add(b); f.add(text1);
                                f.setSize(300,300);
                                f.setLayout(null);
                                f.setVisible(true);
                               // String str = text1.getText();

                                try {
                                    FileWriter fw = new FileWriter(new File("output.txt"));
                                    value.write(fw);
                                    fw.close();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                }
                        }
                        });


                    }
                });

        // Create Cancel button
        JButton btnCancel = new JButton("For staff");
        btnCancel.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame,
                                "You need password to update record"
                        );
                    }
                });

        // Add buttons to a panel
        JPanel buttonPanel = new JPanel( );
        buttonPanel.add(btnOK);
        buttonPanel.add(btnCancel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane( ).add(buttonPanel,BorderLayout.SOUTH);
        frame.setVisible(true);

    }
    }

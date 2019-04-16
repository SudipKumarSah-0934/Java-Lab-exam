package Lab;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Academic {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("IIT");

        // Create OK button
        JButton btnOK = new JButton("For Student");

        btnOK.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame,
                                "choose option"
                        );

                        JFrame f=new JFrame("Password Field Example");
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
                                String data = "Username " + text.getText();
                                data += ", Password: "
                                        + new String(value.getPassword());
                                label.setText(data);
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
        frame.setSize(500, 500);
        frame.getContentPane( ).add(buttonPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
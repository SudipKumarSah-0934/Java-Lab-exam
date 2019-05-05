package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hackathon {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hackathon window = new Hackathon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hackathon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBank = new JLabel("IIT");
		lblBank.setBounds(202, 23, 165, 74);
		lblBank.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		frame.getContentPane().add(lblBank);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblUsername.setBounds(44, 97, 70, 25);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(124, 101, 94, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblPassword.setBounds(44, 135, 70, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 132, 94, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().isEmpty() || passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Input Username and Password");	
				}else if (textField.getText().equals("iit") && passwordField.getText().equals("12345")) {
					JOptionPane.showMessageDialog(null, "Login is successful");
					frame.dispose();
					work info = new work();
					info.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "sorry,try again", "Warning", JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(187, 211, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
	
}

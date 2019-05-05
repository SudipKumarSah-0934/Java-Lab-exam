package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Account extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNkAccount = new JLabel("Bank Account");
		lblNkAccount.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNkAccount.setBounds(192, 11, 145, 26);
		contentPane.add(lblNkAccount);
		
		JButton btnCheckExistingAccount = new JButton("Check Existing Account");
		btnCheckExistingAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExistingAcc acc1;
				try {
					acc1 = new ExistingAcc();
					acc1.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnCheckExistingAccount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnCheckExistingAccount.setBounds(221, 130, 203, 57);
		contentPane.add(btnCheckExistingAccount);
		
		JButton btnCreateNewAccount = new JButton("Create New Account");
		btnCreateNewAccount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnCreateNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewAccInterface acc = new NewAccInterface();
				acc.setVisible(true);
			}
		});
		btnCreateNewAccount.setBounds(29, 130, 182, 57);
		contentPane.add(btnCreateNewAccount);
	}
}

package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class work extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public work() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 12, 0, 0);
		
		JButton btnBankTransaction = new JButton("Student Info");
		btnBankTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Enter into student data page");
				personal info1 = new personal();
				info1.setVisible(true);
				
				Academic aca = new Academic();
				aca.setVisible(true);
			}
		});
		btnBankTransaction.setToolTipText("see student record");
		btnBankTransaction.setBounds(131, 115, 145, 27);
		btnBankTransaction.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		
		JButton btnStudentInfo = new JButton("Bank");
		btnStudentInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Account acc = new Account();
				acc.setVisible(true);
			}
		});
		btnStudentInfo.setToolTipText("personal and academic record");
		btnStudentInfo.setBounds(131, 153, 145, 27);
		btnStudentInfo.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		
		JLabel label = new JLabel("");
		label.setBounds(-10008, -10031, 0, 0);
		
		JLabel lblIitPage = new JLabel("IIT page");
		lblIitPage.setBounds(136, 29, 140, 94);
		lblIitPage.setFont(new Font("Times New Roman", Font.BOLD, 30));
		contentPane.setLayout(null);
		contentPane.add(label_1);
		contentPane.add(btnBankTransaction);
		contentPane.add(btnStudentInfo);
		contentPane.add(label);
		contentPane.add(lblIitPage);
	}

}

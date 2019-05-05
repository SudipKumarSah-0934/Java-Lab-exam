package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Academic extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Academic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcademicInfo = new JLabel("Academic Info");
		lblAcademicInfo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAcademicInfo.setBounds(220, 11, 133, 30);
		contentPane.add(lblAcademicInfo);
		
		JLabel lblRollNo = new JLabel("Roll no:");
		lblRollNo.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblRollNo.setBounds(10, 75, 71, 14);
		contentPane.add(lblRollNo);
		
		textField = new JTextField();
		textField.setBounds(91, 73, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSession = new JLabel("Session:");
		lblSession.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblSession.setBounds(10, 100, 71, 27);
		contentPane.add(lblSession);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 104, 115, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRegistrationNumer = new JLabel("Registration number:");
		lblRegistrationNumer.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblRegistrationNumer.setBounds(10, 132, 133, 20);
		contentPane.add(lblRegistrationNumer);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 135, 162, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblHallName = new JLabel("Hall name:");
		lblHallName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblHallName.setBounds(10, 163, 71, 14);
		contentPane.add(lblHallName);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 161, 333, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll =textField.getText().toString();
				String session =textField_1.getText().toString();
				String registration =textField_2.getText().toString();
				String hall =textField_3.getText().toString();
				
				try {
					FileWriter wri = new FileWriter("academicINfo.txt",true);
					wri.write(roll+",");
					wri.write(session+",");
					wri.write(registration+",");
					wri.write(hall+",");
					wri.write(System.lineSeparator());
					wri.close();
					JOptionPane.showMessageDialog(null, "completed");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSave.setBounds(74, 227, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText("");
				 textField_1.setText("");
				 textField_2.setText("");
				 textField_3.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(306, 227, 89, 23);
		contentPane.add(btnReset);
	}

}

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

public class personal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public personal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecord = new JLabel("Record");
		lblRecord.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRecord.setBounds(199, 11, 68, 31);
		contentPane.add(lblRecord);
		
		JLabel lblFullName = new JLabel("full name");
		lblFullName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblFullName.setBounds(7, 61, 75, 14);
		contentPane.add(lblFullName);
		
		textField = new JTextField();
		textField.setBounds(102, 59, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFathersName = new JLabel("father's name");
		lblFathersName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblFathersName.setBounds(7, 86, 85, 14);
		contentPane.add(lblFathersName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 83, 113, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMothersName = new JLabel("mother's name");
		lblMothersName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblMothersName.setBounds(7, 112, 95, 14);
		contentPane.add(lblMothersName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 110, 113, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblAddress.setBounds(10, 137, 60, 14);
		contentPane.add(lblAddress);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 135, 113, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(7, 152, 46, 14);
		contentPane.add(label);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblGender.setBounds(7, 162, 60, 14);
		contentPane.add(lblGender);
		
		textField_5 = new JTextField();
		textField_5.setBounds(102, 160, 113, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 184, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRollNo = new JLabel("Roll no.");
		lblRollNo.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblRollNo.setBounds(7, 187, 63, 14);
		contentPane.add(lblRollNo);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =textField.getText().toString();
				String father =textField_1.getText().toString();
				String mother =textField_2.getText().toString();
				String address =textField_3.getText().toString();
				String gender =textField_5.getText().toString();
				String roll =textField_4.getText().toString();
				try {
					FileWriter wri = new FileWriter("personalINfo.txt",true);
					wri.write(roll+",");
					wri.write(name+",");
					wri.write(father+",");
					wri.write(mother+",");
					wri.write(address+",");
					wri.write(gender);
					wri.write(System.lineSeparator());
					wri.close();
					JOptionPane.showMessageDialog(null, "completed");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave.setBounds(169, 227, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText("");
				textField.setText("");
				 textField_1.setText("");
				 textField_2.setText("");
				 textField_3.setText("");
				 textField_5.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(335, 228, 89, 23);
		contentPane.add(btnReset);
		
		
	}

}

package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;


public class NewAccInterface extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField_3;
	public NewAccInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEnterYourPersonal = new JLabel("Enter your Personal Information");
		lblEnterYourPersonal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEnterYourPersonal.setBounds(95, 11, 295, 24);
		contentPane.add(lblEnterYourPersonal);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblName.setBounds(10, 59, 46, 14);
		contentPane.add(lblName);

		textField = new JTextField();
		textField.setBounds(184, 57, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblGender.setBounds(10, 84, 57, 14);
		contentPane.add(lblGender);

		textField_1 = new JTextField();
		textField_1.setBounds(184, 82, 166, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblAccountNo = new JLabel("New Account No:");
		lblAccountNo.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblAccountNo.setBounds(10, 109, 114, 14);
		contentPane.add(lblAccountNo);

		textField_2 = new JTextField();
		textField_2.setBounds(184, 107, 166, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblPassword.setBounds(10, 134, 68, 24);
		contentPane.add(lblPassword);

		JLabel lblContactNum = new JLabel("contact Num.");
		lblContactNum.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblContactNum.setBounds(10, 169, 114, 17);
		contentPane.add(lblContactNum);

		textField_4 = new JTextField();
		textField_4.setBounds(184, 168, 166, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel = new JLabel("Amount deposit:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 198, 126, 18);
		contentPane.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(184, 137, 166, 20);
		contentPane.add(passwordField);

		textField_3 = new JTextField();
		textField_3.setBounds(184, 196, 166, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		String name =textField.getText().toString();
		String gender =textField_1.getText().toString();
		String aacno =textField_2.getText().toString();
		String  password =passwordField.getText().toString();
		String contactno =textField_4.getText().toString();
		String amount =textField_3.getText().toString();

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String PATTERN = "((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,15})";
				Pattern pattern = Pattern.compile(PATTERN);

				Matcher matcher = pattern.matcher(password);
				if(matcher.matches()){
					JOptionPane.showMessageDialog(null, "password entered is valid and creating account");
					try {
						FileWriter wri = new FileWriter("BankAccountInfo.txt",true);
						wri.write(name+",");
						wri.write(gender+",");
						wri.write(aacno+",");
						wri.write(password+",");
						wri.write(contactno+",");
						wri.write(amount);
						wri.write(System.lineSeparator());
						wri.close();
						JOptionPane.showMessageDialog(null, "completed");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					JOptionPane.showMessageDialog(null, "password entered is not valid");
				}		  

			}

		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd.setBounds(95, 229, 89, 23);
		contentPane.add(btnAdd);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				passwordField.setText(null);
				textField_4.setText(null);
				textField_3.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(282, 230, 89, 23);
		contentPane.add(btnReset);
		
	}
}

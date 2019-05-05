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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ExistingAcc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public String str,str1,str2,str3,str4,str5;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public ExistingAcc() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblAccountInformationAnd = new JLabel("Account Information and updating");
		lblAccountInformationAnd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAccountInformationAnd.setBounds(91, 11, 318, 24);
		contentPane.add(lblAccountInformationAnd);

		JLabel lblAccountNum = new JLabel("Account Number");
		lblAccountNum.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblAccountNum.setBounds(67, 95, 134, 32);
		contentPane.add(lblAccountNum);

		textField = new JTextField();
		textField.setBounds(211, 95, 133, 27);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(211, 133, 133, 27);
		contentPane.add(passwordField);
		FileReader fr;
		Scanner in = new Scanner(System.in);
		System.out.println("enter account holders name to login");
		String pr=in.nextLine();

		try {
			fr = new FileReader("BankAccountInfo.txt");
			BufferedReader br=new BufferedReader(fr);
			String s;
			String line;
			while ((s=br.readLine())!=null)
			{
				int indexfound=s.indexOf(pr);
				if (indexfound=='\0')
				{
					line=s;
					System.out.println(line);
					String[] values = line.split(",");
					str = values[0];
					str1 = values[1];
					str2 = values[2];
					str3 = values[3];
					str4 = values[4];
					str5 = values[5];
				}
				else if(indexfound<-1) {
					System.out.println("file has no such name");
				}

			}
			JButton btnEnter = new JButton("Enter");
			btnEnter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField.getText().isEmpty() || passwordField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please Input Username and Password");	
					}else if (textField.getText().equals(str2) && passwordField.getText().equals(str3)) {
						JOptionPane.showMessageDialog(null, "Login is successful");
						

					}
					else {
						JOptionPane.showMessageDialog(null, "sorry,try again", "Warning", JOptionPane.ERROR_MESSAGE);
						textField.setText(null);
						passwordField.setText(null);
					}
				}
			});
			btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 20));
			btnEnter.setBounds(204, 227, 89, 23);
			contentPane.add(btnEnter);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblPassword.setBounds(67, 138, 107, 14);
		contentPane.add(lblPassword);


	}

}

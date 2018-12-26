
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.util.Arrays;
import java.awt.Color;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField textField_4;
static String name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setVerticalAlignment(SwingConstants.TOP);
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblSignUp.setBounds(138, 11, 155, 54);
		contentPane.add(lblSignUp);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(122, 74, 62, 19);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(122, 103, 62, 19);
		contentPane.add(lblAge);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number: ");
		lblMobileNumber.setBounds(122, 133, 82, 19);
		contentPane.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(122, 163, 62, 19);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(122, 193, 62, 19);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(233, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 132, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(233, 162, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JPasswordField();
		textField_4.setBounds(233, 192, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
					String str="insert into signup values(?,?,?,?,?)";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.setString(1,textField.getText());	
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,Arrays.toString(textField_4.getPassword()));
					ps.executeUpdate();
					cn.close();
					Login l=new Login();
					l.setVisible(true);
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
			}
		});
		btnSignUp.setBounds(335, 227, 89, 23);
		contentPane.add(btnSignUp);
		
		name=textField.getText().toString().trim();
	}
}

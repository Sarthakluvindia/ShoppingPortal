import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import com.mysql.jdbc.Connection;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Arrays;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	String cemail="";
	String cpass="";
	static String name="";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setVerticalAlignment(SwingConstants.TOP);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblLogin.setBounds(149, 11, 131, 52);
		contentPane.add(lblLogin);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(124, 75, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(124, 100, 67, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(215, 74, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(215, 97, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDoNotHave = new JLabel("Do not have an account.");
		lblDoNotHave.setBounds(124, 125, 156, 20);
		contentPane.add(lblDoNotHave);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String email=textField.getText().toString();
					String pass=Arrays.toString(textField_1.getPassword());
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
				String str="select * from signup where email='"+email+"' and password='"+pass+"'";
				java.sql.PreparedStatement ps4=cn.prepareStatement(str);
				ResultSet rs=ps4.executeQuery();
				while(rs.next())
				{
					cemail=rs.getString("email").trim();
					cpass=rs.getString("password").trim();
					name=rs.getString("name");
				}
				if(cemail.equals(email)&&cpass.equals(pass))
					{
					WelcomePage wp=new WelcomePage();
					wp.setVisible(true);
					}
				else
					JOptionPane.showConfirmDialog(null,"Enter correct email or password" );
				cn.close();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnLogin.setBounds(175, 170, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup sc=new Signup();
				sc.setVisible(true);
			}
		});
		btnSignUp.setBounds(268, 124, 86, 23);
		contentPane.add(btnSignUp);
	}

}

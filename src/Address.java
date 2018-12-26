import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.util.Arrays;


public class Address extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address frame = new Address();
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
	public Address() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAddress.setBounds(171, 11, 105, 29);
		contentPane.add(lblAddress);
		
		JLabel lblAddressLine = new JLabel("Address Line 1:");
		lblAddressLine.setBounds(105, 60, 105, 14);
		contentPane.add(lblAddressLine);
		
		textField = new JTextField();
		textField.setBounds(209, 57, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddressLine_1 = new JLabel("Address Line 2: ");
		lblAddressLine_1.setBounds(105, 85, 105, 14);
		contentPane.add(lblAddressLine_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 82, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAddressLine_2 = new JLabel("Address Line 3: ");
		lblAddressLine_2.setBounds(105, 110, 105, 14);
		contentPane.add(lblAddressLine_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(209, 107, 151, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(105, 135, 46, 14);
		contentPane.add(lblCity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 132, 151, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("State: ");
		lblNewLabel.setBounds(105, 185, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPincode = new JLabel("Pincode: ");
		lblPincode.setBounds(105, 160, 46, 14);
		contentPane.add(lblPincode);
		
		textField_4 = new JTextField();
		textField_4.setBounds(209, 157, 151, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(209, 182, 151, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
					String str="insert into address values(?,?,?,?,?,?)";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.setString(1,textField.getText());	
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,textField_3.getText());
					ps.setString(5,textField_4.getText());
					ps.setString(6,textField_5.getText());
					ps.executeUpdate();
					cn.close();
					PaymentMethod pm=new PaymentMethod();
					pm.setVisible(true);
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
			}
		});
		btnSubmit.setBounds(171, 227, 89, 23);
		contentPane.add(btnSubmit);
	}
}

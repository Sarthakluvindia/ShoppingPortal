import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.List;

import javax.swing.JTable;

import com.mysql.jdbc.Connection;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bill extends JFrame {

	private JPanel contentPane;
	private JTable table;
	int sum=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill();
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
	void fill() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
		String str="select product_name,quantity,price,quantity*price from cart";
		java.sql.PreparedStatement ps4=cn.prepareStatement(str);
		ResultSet rs=ps4.executeQuery();
		DefaultTableModel dc=new DefaultTableModel();
		dc.addColumn("Name");
		dc.addColumn("Quantity");
		dc.addColumn("Price");
		dc.addColumn("Amount");
		
		while(rs.next())
		{
			dc.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
			sum=sum+Integer.parseInt(rs.getString(4));
			System.out.println(sum);
		}
		table.setModel(dc);
		cn.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public Bill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 100, 30);
		contentPane.add(panel);
		BufferedImage myPicture = null;
		try{
			myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\rsz_stopnshop-logo.png"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBackground(new Color(255, 255, 255));
		panel.add(picLabel);
		
		JLabel lblYourBill = new JLabel("Your Bill");
		lblYourBill.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblYourBill.setBounds(171, 11, 154, 30);
		contentPane.add(lblYourBill);
		
		JLabel lblSubTotal = new JLabel("Sub Total:");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubTotal.setBounds(193, 223, 100, 27);
		contentPane.add(lblSubTotal);
		
		table = new JTable();
		table.setBounds(10,45,414,167);
		contentPane.add(table);
		fill();
		
		JLabel lblRs = new JLabel("Rs. "+sum);
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs.setBounds(303, 223, 107, 27);
		contentPane.add(lblRs);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
					String str="delete from cart";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.executeUpdate();
					cn.close();
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
				dispose();
			}
		});
		btnCheckOut.setBounds(11, 228, 115, 23);
		contentPane.add(btnCheckOut);
	}
}

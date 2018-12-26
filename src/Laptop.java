import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.SwingConstants;
import java.awt.Insets;


public class Laptop extends JFrame implements WindowListener {

	private JPanel contentPane;
	JComboBox comboBox;
	String amt;
	/**
	 * @wbp.nonvisual location=37,279
	 */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laptop frame = new Laptop();
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
	public Laptop() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 38, 182, 163);
		contentPane.add(panel);
		BufferedImage myPicture = null;
		try{
			myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\laptop_main.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBackground(new Color(255, 255, 255));
		panel.add(picLabel);
		
		JLabel lblLaptop = new JLabel("Laptop");
		lblLaptop.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLaptop.setBounds(292, 26, 85, 24);
		contentPane.add(lblLaptop);
		
		JLabel lblRs = new JLabel("Rs. 50,000");
		lblRs.setBounds(270, 55, 70, 24);
		contentPane.add(lblRs);
		
		JLabel lblWarranty = new JLabel("Warranty: ");
		lblWarranty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWarranty.setBounds(202, 82, 70, 14);
		contentPane.add(lblWarranty);
		
		JLabel lblNewLabel = new JLabel("1 Year Manufacturer Warranty");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(270, 82, 171, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart c=new Cart();
				c.setVisible(true);
			}
		});
		btnCart.setBounds(335, 227, 89, 23);
		contentPane.add(btnCart);
		
		JLabel lblHighlights = new JLabel("Highlights: ");
		lblHighlights.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHighlights.setBounds(202, 107, 70, 14);
		contentPane.add(lblHighlights);
		
		JLabel lblNewLabel_1 = new JLabel("Intel Atom Quad Core Processor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(270, 107, 154, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2 GB DDB3 RAM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(270, 124, 154, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("64 bit Windows 10");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(270, 141, 156, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblInchHd = new JLabel("10.1 inch HD display");
		lblInchHd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInchHd.setBounds(270, 158, 154, 14);
		contentPane.add(lblInchHd);
		
		JLabel lblSeller = new JLabel("Seller: ");
		lblSeller.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeller.setBounds(202, 187, 46, 14);
		contentPane.add(lblSeller);
		
		JLabel lblAbnSales = new JLabel("ABN sales");
		lblAbnSales.setBounds(270, 187, 107, 14);
		contentPane.add(lblAbnSales);
		
		JLabel lblNewLabel_4 = new JLabel("Amount:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(202, 60, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		comboBox.setBounds(121, 213, 40, 20);
		contentPane.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 100, 30);
		contentPane.add(panel_1);
		
		BufferedImage pichead = null;
		try{
			pichead = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\rsz_stopnshop-logo.png"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabeheader = new JLabel(new ImageIcon(pichead));
		picLabeheader.setBackground(new Color(255, 255, 255));
		panel_1.add(picLabeheader);
		
		amt=lblRs.getText().substring(4,10);
		System.out.println(amt);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/shoppingportal?user=root&password=Sarthak@124");
					String str="insert into cart values(?,?,?)";
					java.sql.PreparedStatement ps=cn.prepareStatement(str);
					ps.setString(1,lblLaptop.getText());	
					ps.setString(2,amt.replaceAll(",",""));
					ps.setString(3,comboBox.getSelectedItem().toString());
					ps.executeUpdate();
					cn.close();
					Electronics e=new Electronics();
					e.setVisible(true);
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f.getMessage());
				}
			}
		});
		btnAddToCart.setBounds(10, 212, 101, 23);
		contentPane.add(btnAddToCart);
		
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		WelcomePage wp=new WelcomePage();
		wp.setVisible(true);
		System.out.println("closed");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		WelcomePage wp=new WelcomePage();
		wp.setVisible(true);
		System.out.println("closed");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

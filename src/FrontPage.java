import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class FrontPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage frame = new FrontPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrontPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 110);
		contentPane.add(panel);
		BufferedImage myPicture = null;
		try{
			myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\stopnshop-logo.png"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		panel.add(picLabel);
		
		JLabel lblNewLabel = new JLabel("Wide range of genuine products, easy returns, cash on delivery, browse  now!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 116, 424, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblxcvk = new JLabel("Types: Smartphones and Electronics, Books, Apprels, Home Kitchen");
		lblxcvk.setBounds(10, 142, 414, 26);
		contentPane.add(lblxcvk);
		
		JLabel lblToLogin = new JLabel("To Login: ");
		lblToLogin.setBounds(10, 174, 200, 50);
		contentPane.add(lblToLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l=new Login();
				l.setVisible(true);
			}
		});
		btnLogin.setBounds(20, 213, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblToKnowMore = new JLabel("To know more:");
		lblToKnowMore.setBounds(265, 174, 200, 50);
		contentPane.add(lblToKnowMore);
		
		JButton btnAboutUs = new JButton("About Us...");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutUs a=new AboutUs();
				a.setVisible(true);
			}
		});
		btnAboutUs.setBounds(292, 213, 105, 23);
		contentPane.add(btnAboutUs);
	}
}

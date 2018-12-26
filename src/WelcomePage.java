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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WelcomePage extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 100, 30);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(100, 0, 334, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		String name=Signup.name;
		String namel=Login.name;
		if(name==null)
		{
		lblNewLabel = new JLabel("Welcome "+namel+" !");
		}
		else
		lblNewLabel = new JLabel("Welcome "+name+" !");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(75, 0, 165, 30);
		panel_1.add(lblNewLabel);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(78, 41, 80, 60);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(260, 41, 80, 60);
		contentPane.add(panel_3);
		BufferedImage myPicture2 = null;
		try{
			myPicture2 = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\books.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
		picLabel2.setBackground(new Color(255, 255, 255));
		panel_3.add(picLabel2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(78, 154, 80, 60);
		contentPane.add(panel_4);
		BufferedImage shirtimage=null;
		try {
			shirtimage=ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\shirt.png"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		JLabel applabel=new JLabel(new ImageIcon(shirtimage));
		applabel.setBackground(Color.WHITE);
		panel_4.add(applabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(260, 154, 80, 60);
		contentPane.add(panel_5);
		BufferedImage kitimage=null;
		try {
			kitimage=ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\kitchen.png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		JLabel kitchenlabel=new JLabel(new ImageIcon(kitimage));
		kitchenlabel.setBackground(Color.WHITE);
		panel_5.add(kitchenlabel);
		
		JButton btnElectronics = new JButton("Electronics");
		btnElectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Electronics el=new Electronics();
				el.setVisible(true);
			}
		});
		btnElectronics.setBounds(78, 117, 89, 23);
		contentPane.add(btnElectronics);
		BufferedImage myPicture1 = null;
		try{
			myPicture1 = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\Dell_Inspiron_15_3543_S_1.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
		picLabel.setBackground(new Color(255, 255, 255));
		panel_2.add(picLabel1);
		
		JButton btnBooks = new JButton("Books");
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Books b=new Books();
				b.setVisible(true);
			}
		});
		btnBooks.setBounds(260, 117, 89, 23);
		contentPane.add(btnBooks);
		BufferedImage myPicture3 = null;
		try{
			myPicture3 = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\download.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		picLabel.setBackground(new Color(255, 255, 255));
		
		JButton btnApprels = new JButton("Apprels");
		btnApprels.setBounds(78, 230, 89, 23);
		contentPane.add(btnApprels);
		
		JButton btnKitchenware = new JButton("Kitchen");
		btnKitchenware.setBounds(259, 230, 89, 23);
		contentPane.add(btnKitchenware);
	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PaymentMethod extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentMethod frame = new PaymentMethod();
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
	public PaymentMethod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnCashOnDelivery = new JRadioButton("Cash on Delivery");
		rdbtnCashOnDelivery.setBackground(Color.WHITE);
		rdbtnCashOnDelivery.setBounds(47, 59, 131, 23);
		contentPane.add(rdbtnCashOnDelivery);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPaymentMethod.setBounds(31, 21, 201, 31);
		contentPane.add(lblPaymentMethod);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("Credit Card");
		rdbtnCreditCard.setBackground(Color.WHITE);
		rdbtnCreditCard.setBounds(47, 85, 109, 23);
		contentPane.add(rdbtnCreditCard);
		
		JRadioButton rdbtnDebitCard = new JRadioButton("Debit Card");
		rdbtnDebitCard.setBackground(Color.WHITE);
		rdbtnDebitCard.setBounds(47, 111, 109, 23);
		contentPane.add(rdbtnDebitCard);
		
		JRadioButton rdbtnPaytm = new JRadioButton("PayTM");
		rdbtnPaytm.setBackground(Color.WHITE);
		rdbtnPaytm.setBounds(47, 137, 109, 23);
		contentPane.add(rdbtnPaytm);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bill b=new Bill();
				b.setVisible(true);
			}
		});
		btnBuy.setBounds(297, 211, 89, 23);
		contentPane.add(btnBuy);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(222, 63, 171, 118);
		contentPane.add(panel);
		BufferedImage myPicture = null;
		try{
			myPicture = ImageIO.read(new File("D:\\JAVA PROGRAM\\ShoppingPortal\\truck.jpg"));
		}
		catch(Exception e)
		{
			System.err.println(""+e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBackground(new Color(255, 255, 255));
		panel.add(picLabel);
	}
}

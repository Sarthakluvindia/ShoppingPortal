import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class AboutUs extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AboutUs() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMyLibraryManagement = new JLabel("Shopping Portal ");
		lblMyLibraryManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyLibraryManagement.setVerticalAlignment(SwingConstants.TOP);
		lblMyLibraryManagement.setFont(new Font("Arial", Font.BOLD, 25));
		lblMyLibraryManagement.setBounds(10, 11, 414, 35);
		contentPane.add(lblMyLibraryManagement);
		
		JLabel lblUsingThisManagement = new JLabel("Shopping portal helps you find all your  necessary items at one place.");
		lblUsingThisManagement.setBounds(10, 50, 414, 35);
		contentPane.add(lblUsingThisManagement);
		
		JLabel lblAlsoTheCustomer = new JLabel("You can browse various types of items available for sale, check their prices .\r\n");
		lblAlsoTheCustomer.setVerticalAlignment(SwingConstants.TOP);
		lblAlsoTheCustomer.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlsoTheCustomer.setBounds(10, 78, 424, 28);
		contentPane.add(lblAlsoTheCustomer);
		
		JLabel lblToPayIn = new JLabel("to pay in case of late return.");
		lblToPayIn.setBounds(10, 96, 394, 14);
		contentPane.add(lblToPayIn);
		
		JLabel lblThisManagementProgram = new JLabel("The delivered items if found damaged at the time of dilivery, can be returned.");
		lblThisManagementProgram.setBounds(10, 117, 394, 14);
		contentPane.add(lblThisManagementProgram);
		
		JLabel lblToFollowThe = new JLabel(" warranty card will be delivered along with the product.");
		lblToFollowThe.setBounds(10, 133, 424, 14);
		contentPane.add(lblToFollowThe);
		
		JLabel lblHopeYouEnjoy = new JLabel("Thanks for reading");
		lblHopeYouEnjoy.setBounds(10, 158, 243, 14);
		contentPane.add(lblHopeYouEnjoy);
		
		JButton btnNext = new JButton("Login");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l=new Login();
				l.setVisible(true);
				l.setBounds(getMaximizedBounds());
			}
		});
		btnNext.setBounds(324, 227, 89, 23);
		contentPane.add(btnNext);
	}
}

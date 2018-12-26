import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.Icon;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Apprels extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apprels frame = new Apprels();
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
	public Apprels() {
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
		
		JLabel lblElectronics = new JLabel("Apprels");
		lblElectronics.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblElectronics.setBounds(185, 0, 169, 30);
		contentPane.add(lblElectronics);
		
		 BufferedImage image = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\ShoppingPortal\\mens.jpg");
		        image = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon icon = new ImageIcon(image);
		JButton btnLaptop = new JButton("",icon);
		btnLaptop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Laptop lp=new Laptop();
				lp.setVisible(true);
			}
		});
		btnLaptop.setBackground(Color.WHITE);
		btnLaptop.setForeground(Color.WHITE);
		btnLaptop.setBounds(99, 64, 80, 60);
		contentPane.add(btnLaptop);
		
		 BufferedImage imagetv = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\ShoppingPortal\\womens.jpg");
		        imagetv = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon icontv = new ImageIcon(imagetv);
		JButton btnTv = new JButton("",icontv);
		btnTv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TV t=new TV();
				t.setVisible(true);
			}
		});
		btnTv.setBackground(Color.WHITE);
		btnTv.setForeground(Color.WHITE);
		btnTv.setBounds(249, 64, 80, 60);
		contentPane.add(btnTv);
		
		 BufferedImage imagemob = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\ShoppingPortal\\kids.jpg");
		        imagemob = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon iconmob = new ImageIcon(imagemob);
		JButton btnMobile = new JButton("",iconmob);
		btnMobile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mobile mob=new Mobile();
				mob.setVisible(true);
			}
		});
		btnMobile.setBounds(99, 159, 80, 60);
		contentPane.add(btnMobile);
		
		 BufferedImage imagesp = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\ShoppingPortal\\casual.jpg");
		        imagesp = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon iconsp = new ImageIcon(imagesp);
		JButton btnSpeakers = new JButton("",iconsp);
		btnSpeakers.setBackground(Color.WHITE);
		btnSpeakers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Speakers sp=new Speakers();
				sp.setVisible(true);
			}
		});
		btnSpeakers.setBounds(249, 159, 80, 60);
		contentPane.add(btnSpeakers);
		
		JLabel lblLaptop = new JLabel("Men's");
		lblLaptop.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaptop.setBounds(99, 124, 80, 14);
		contentPane.add(lblLaptop);
		
		JLabel lblTv = new JLabel("Women's");
		lblTv.setHorizontalAlignment(SwingConstants.CENTER);
		lblTv.setBounds(249, 124, 80, 14);
		contentPane.add(lblTv);
		
		JLabel lblMobile = new JLabel("Kids");
		lblMobile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobile.setBounds(99, 219, 80, 14);
		contentPane.add(lblMobile);
		
		JLabel lblSpeakers = new JLabel("Casual");
		lblSpeakers.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeakers.setBounds(249, 219, 80, 14);
		contentPane.add(lblSpeakers);
		
		 BufferedImage imageback = null;
		    try {
		        File file=new File("D:\\JAVA PROGRAM\\ShoppingPortal\\arrow1.jpg");
		        imageback = ImageIO.read(file);
		    } catch (IOException ioex) {
		        System.err.println("load error: " + ioex.getMessage());
		    }
		    ImageIcon iconback = new ImageIcon(imageback);
	}
}

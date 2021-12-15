package DEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ThongTinSV extends JFrame {

	private JPanel contentPane;
	 JComboBox comboGender;
	 JTextField txtFullname;
	 JTextField txtAge;
	 JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinSV frame = new ThongTinSV();
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
	public ThongTinSV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFullname = new JLabel("Fullname:");
		lblFullname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFullname.setBounds(10, 26, 78, 31);
		contentPane.add(lblFullname);
		
		txtFullname = new JTextField();
		txtFullname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtFullname.setBounds(111, 26, 290, 31);
		contentPane.add(txtFullname);
		txtFullname.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtAge.setColumns(10);
		txtAge.setBounds(111, 113, 290, 31);
		contentPane.add(txtAge);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAge.setBounds(10, 113, 78, 31);
		contentPane.add(lblAge);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(111, 155, 290, 31);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(10, 155, 78, 31);
		contentPane.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGender.setBounds(10, 68, 78, 31);
		contentPane.add(lblGender);
		
		comboGender = new JComboBox();
		comboGender.setBounds(111, 68, 85, 34);
		contentPane.add(comboGender);
		
		
	}
}

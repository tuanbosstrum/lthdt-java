package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class SINHVIEN extends JFrame {

	private JPanel contentPane;
	private JTextField textHoTen;
	private JTextField textTuoi;
	private JTextField textPhone;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SINHVIEN frame = new SINHVIEN();
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
	public SINHVIEN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 2, 670, 397);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTT = new JLabel("THONG TIN SINH VIEN");
		lblTT.setForeground(new Color(204, 51, 51));
		lblTT.setFont(new Font("Arial", Font.BOLD, 25));
		lblTT.setHorizontalAlignment(SwingConstants.CENTER);
		lblTT.setBounds(162, 28, 365, 48);
		panel.add(lblTT);
		
		JLabel lblHoTen = new JLabel("H\u1ECD v\u00E0 t\u00EAn:");
		lblHoTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoTen.setBounds(87, 107, 104, 26);
		panel.add(lblHoTen);
		
		textHoTen = new JTextField();
		textHoTen.setBounds(324, 111, 224, 26);
		panel.add(textHoTen);
		textHoTen.setColumns(10);
		
		JLabel lblTuoi = new JLabel("Tu\u1ED5i:");
		lblTuoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTuoi.setBounds(87, 157, 104, 26);
		panel.add(lblTuoi);
		
		textTuoi = new JTextField();
		textTuoi.setBounds(324, 162, 225, 26);
		panel.add(textTuoi);
		textTuoi.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhone.setBounds(87, 207, 104, 26);
		panel.add(lblPhone);
		
		textPhone = new JTextField();
		textPhone.setBounds(325, 212, 226, 26);
		panel.add(textPhone);
		textPhone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(87, 260, 74, 26);
		panel.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(326, 261, 225, 26);
		panel.add(textEmail);
		textEmail.setColumns(10);
	}
}

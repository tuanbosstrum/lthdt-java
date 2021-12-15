package DUAN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 913, 632);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.focus"));
		panel_1.setBounds(10, 10, 311, 612);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 20, 288, 63);
		panel_3.setBackground(new Color(255, 51, 102));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD H\u1ECDc Vi\u00EAn");
		lblNewLabel.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconsmenu1_account_circle_black_24dp.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 10, 270, 43);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 104, 287, 63);
		panel_4.setBackground(new Color(0, 204, 51));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00E0n H\u00ECnh Ch\u00EDnh");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconsmenu0_important_devices_black_24dp.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(8, 6, 273, 53);
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 185, 287, 63);
		panel_5.setBackground(new Color(0, 204, 51));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Qu\u1EA3n L\u00FD h\u1ECDc Vi\u00EAn");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconsmenu1_account_circle_black_24dp.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(8, 7, 273, 48);
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(51, 204, 0));
		panel_6.setBounds(11, 266, 285, 65);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Qu\u1EA3n L\u00FD Kh\u00F3a H\u1ECDc");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconsmenu2_dns_black_24dp.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(7, 8, 271, 49);
		panel_6.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(330, 10, 573, 612);
		panel.add(panel_2);
	}
}

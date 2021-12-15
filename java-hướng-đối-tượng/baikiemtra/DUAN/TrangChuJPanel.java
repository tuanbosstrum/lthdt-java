package DUAN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TrangChuJPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChuJPanel frame = new TrangChuJPanel();
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
	public TrangChuJPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 934, 599);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(5, 8, 316, 224);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconstrangchu1_insert_invitation_black_24dp.png"));
		lblNewLabel.setBounds(37, 20, 103, 91);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kh\u00F3a H\u1ECDc");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(137, 148, 139, 44);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 255, 255));
		panel_2.setBounds(331, 7, 316, 225);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\icontrangchu2_face_white_36dp.png"));
		lblNewLabel_2.setBounds(27, 27, 93, 92);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("H\u1ECDc Vi\u00EAn");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(166, 161, 121, 26);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 0));
		panel_3.setBounds(654, 7, 274, 224);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(18, 40, 87, 75);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconstrangchu3_email_white_36dp.png"));
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("H\u1ED9p Th\u01B0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(146, 165, 92, 25);
		panel_3.add(lblNewLabel_5);
	}

}

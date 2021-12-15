package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CSDL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSDL frame = new CSDL();
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
	public CSDL() {
		setTitle("\u0110\u1ECDc Csdl");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 1, 603, 423);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hi\u1EC3n th\u1ECB th\u00F4ng tin sinh vi\u00EAn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(102, 51, 204));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 20, 380, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\New-icon.png"));
		lblNewLabel_1.setBounds(93, 100, 100, 116);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Chi ti\u1EBFt");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 0, 51));
		btnNewButton.setBounds(397, 341, 111, 30);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(204, 51, 51));
		comboBox.setFont(new Font("Arial", Font.BOLD, 20));
		comboBox.setBounds(342, 104, 213, 31);
		panel.add(comboBox);
	}
}

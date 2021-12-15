package DUAN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class HocVienJPanel extends JFrame {

	private JPanel contentPane;
	private JTextField jtfSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HocVienJPanel frame = new HocVienJPanel();
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
	public HocVienJPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBounds(1, -1, 850, 590);
		contentPane.add(jpnRoot);
		jpnRoot.setLayout(null);
		
		JButton btnNewButton = new JButton("+Th\u00EAm M\u1EDBi");
		btnNewButton.setBounds(656, 17, 161, 36);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		jpnRoot.add(btnNewButton);
		
		jtfSearch = new JTextField();
		jtfSearch.setBounds(23, 19, 451, 35);
		jpnRoot.add(jtfSearch);
		jtfSearch.setColumns(10);
		
		JPanel jpnView = new JPanel();
		jpnView.setBackground(new Color(102, 204, 255));
		jpnView.setBounds(1, 88, 846, 499);
		jpnRoot.add(jpnView);
	}
}

package DEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
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
	public LOGIN() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 45, 86, 17);
		contentPane.add(lblNewLabel);

		username = new JTextField();
		username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		username.setBounds(114, 42, 268, 23);
		contentPane.add(username);
		username.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
					Connection conn = DriverManager.getConnection(dbURL);
					String query = "select * from login where Username=? and Password=?";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, username.getText());
					pst.setString(2, password.getText());
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
						StudentJFrame stu = new StudentJFrame();
						stu.setVisible(true);
						
					} else {
						JOptionPane.showMessageDialog(null, "Kiem tra lai user va password!!!");
						username.setText("");
						password.setText("");
					}
					rs.close();
					pst.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(157, 143, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(10, 89, 86, 17);
		contentPane.add(lblPassword);

		password = new JTextField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		password.setColumns(10);
		password.setBounds(114, 86, 268, 23);
		contentPane.add(password);
	}

}

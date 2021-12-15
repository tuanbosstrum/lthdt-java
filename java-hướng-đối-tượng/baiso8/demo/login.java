package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setBounds(2, 0, 733, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login form");
		lblNewLabel.setIcon(new ImageIcon("C:\\xampp\\htdocs\\Icons\\iconsmenu1_account_circle_black_24dp.png"));
		lblNewLabel.setBounds(244, 20, 234, 59);
		lblNewLabel.setForeground(new Color(102, 255, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(51, 204, 255));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsername.setBounds(65, 160, 130, 43);
		panel.add(lblUsername);
		
		JTextField txtUsername = new JTextField();
		txtUsername.setBounds(243, 156, 310, 46);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setForeground(new Color(51, 204, 255));
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPass.setBounds(68, 249, 118, 45);
		panel.add(lblPass);
		
		JTextField txtPass = new JTextField();
		txtPass.setBounds(244, 249, 310, 44);
		panel.add(txtPass);
		txtPass.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=quanly;user=sa;password=01032001asdasd";
					  Connection conn = DriverManager.getConnection(dbURL);
					  String sql = "Select * from login where Username=? and Password=?";
					  PreparedStatement prst = conn.prepareStatement(sql);
					  prst.setString(1, txtUsername.getText());
					  prst.setString(2, txtPass.getText());
					  
					  ResultSet rs = prst.executeQuery();
					  if(rs.next()) {
						  SINHVIEN frmSV = new SINHVIEN();
						  frmSV.setVisible(true);
					  }else {
						  JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại Passwword?");
						  txtUsername.setText("");
						  txtPass.setText("");
					  }rs.close();
					   prst.close();
					   conn.close();
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(347, 340, 111, 21);
		panel.add(btnNewButton);
	}

}

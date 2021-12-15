package DEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DocCSDL extends JFrame {

	private JPanel contentPane;
	private JComboBox cbName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocCSDL frame = new DocCSDL();
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
	public DocCSDL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hien thi thong tin sinh vien");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 23, 317, 33);
		contentPane.add(lblNewLabel);
		
		cbName = new JComboBox();
		cbName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		cbName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbName.setBounds(189, 85, 212, 33);
		contentPane.add(cbName);
		
		JButton btnChitiet = new JButton("chi tiet");
		btnChitiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
				String abc=(String) cbName.getSelectedItem();
				Connection conn = null;
				PreparedStatement st= null;
				
				try {
					conn=DriverManager.getConnection(dbURL);
					String sql="select * from SINHVIEN where Fullname = ?";
					st=conn.prepareCall(sql);
					st.setString(1, abc);
					ResultSet rs = st.executeQuery();
					if(rs.next()) {
						ThongTinSV tt =new ThongTinSV();
						tt.setVisible(true);
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					if (st != null) {
						try {
							st.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btnChitiet.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnChitiet.setBounds(272, 227, 89, 23);
		contentPane.add(btnChitiet);
		loadCB();	
	}
	public void loadCB() {
		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "select * from SINHVIEN";
			st=conn.prepareCall(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				this.cbName.addItem(rs.getString("Fullname"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	
	}
}

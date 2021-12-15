package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoTinh extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoTinh frame = new DemoTinh();
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
	public DemoTinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 909, 63);
		contentPane.add(panel);
		
		JLabel lblBngTnh = new JLabel("B\u1EA2NG T\u00CDNH");
		lblBngTnh.setForeground(Color.RED);
		lblBngTnh.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		panel.add(lblBngTnh);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 166, 884, 208);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3, 20, 20));
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel);
		
		txtFirstNumber = new JTextField();
		panel_1.add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(lblNewLabel_1);
		
		txtSecondNumber = new JTextField();
		panel_1.add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(lblNewLabel_2);
		
		Result = new JTextField();
		panel_1.add(Result);
		Result.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(30, 482, 877, 111);
		contentPane.add(panel_2);
		
		final JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton ) {
					Double a=Double.parseDouble(txtFirstNumber.getText());
					Double b=Double.parseDouble(txtSecondNumber.getText());
					Result.setText(Double.toString(a+b));
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1 ) {
					Double a=Double.parseDouble(txtFirstNumber.getText());
					Double b=Double.parseDouble(txtSecondNumber.getText());
					Result.setText(Double.toString(a-b));
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2 ) {
					Double a=Double.parseDouble(txtFirstNumber.getText());
					Double b=Double.parseDouble(txtSecondNumber.getText());
					Result.setText(Double.toString(a*b));
				}
			}
		});

		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3 ) {
					Double a=Double.parseDouble(txtFirstNumber.getText());
					Double b=Double.parseDouble(txtSecondNumber.getText());
					Result.setText(Double.toString(a/b));
				}
			}
		});
		
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_3);
		
		final JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstNumber.setText("");
				txtSecondNumber.setText("");
				Result.setText("");
			}
		});
		
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_4);
	}
	
}

package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class DemoDouble extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumber;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoDouble frame = new DemoDouble();
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
	public DemoDouble() {
		setTitle("Double is");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 19, 773, 101);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Double is...");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.RED);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(43, 187, 748, 230);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 50, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Enter a number");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel_1.add(lblNewLabel_1);
		
		textFieldNumber = new JTextField();
		panel_1.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Double is");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2) {
					Double number=Double.parseDouble(textFieldNumber.getText());
					textFieldResult.setText(Double.toString(number*2));
				}
			}
		});
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(btnNewButton_2);
		
		textFieldResult = new JTextField();
		panel_1.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(203, 449, 393, 68);
		contentPane.add(panel_2);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNumber.setText("");
				textFieldResult.setText("");
			}
		});
		panel_2.add(btnNewButton_1);
	}
}

package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class DemoLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoLayout frame = new DemoLayout();
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
	public DemoLayout() {
		setTitle("Layout Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 590);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(182, 6, 541, 82);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("B0");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B1");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("B2");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("B3");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(50);
		panel_1.setBounds(235, 475, 550, 63);
		contentPane.add(panel_1);
		
		JButton btnNewButton_8 = new JButton("Okay");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cancel");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("help");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(btnNewButton_10);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(10);
		panel_2.setBounds(135, 128, 245, 207);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("This component");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("has 12-pixel");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("margins on left");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("and top and has");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("72-pixel margins on right and");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" bottom");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
		flowLayout_2.setVgap(10);
		panel_3.setBorder(new TitledBorder(null, "Column", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(565, 127, 203, 253);
		contentPane.add(panel_3);
		
		JButton btnNewButton_4 = new JButton("BUTTOM 0");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("BUTTOM 1");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("BUTTOM 2");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("BUTTOM 3");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		panel_3.add(btnNewButton_7);
	}
}

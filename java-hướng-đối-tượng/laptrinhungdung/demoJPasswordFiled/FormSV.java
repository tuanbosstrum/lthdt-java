package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSV extends JFrame {

	private JPanel contentPane;
	private JTextField texFirstName;
	private JTextField texLastName;
	private JTextField texTitle;
	private JTextField texNickName;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSV frame = new FormSV();
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
	public FormSV() {
		setTitle("Frame Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Name", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(1, 44, 908, 132);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 4, 30, 30));
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(lblNewLabel);
		
		texFirstName = new JTextField();
		panel.add(texFirstName);
		texFirstName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(lblNewLabel_1);
		
		texLastName = new JTextField();
		panel.add(texLastName);
		texLastName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Title");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(lblNewLabel_2);
		
		texTitle = new JTextField();
		panel.add(texTitle);
		texTitle.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nick Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(lblNewLabel_3);
		
		texNickName = new JTextField();
		panel.add(texNickName);
		texNickName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Email", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(1, 200, 899, 444);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Email Address:");
		lblNewLabel_4.setBounds(10, 19, 164, 37);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(184, 19, 461, 37);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JList list = new JList();
		list.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"item1", "item2", "item3", "item4", "item5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(14, 101, 632, 159);
		panel_1.add(list);
		
		JLabel lblNewLabel_5 = new JLabel("Mail format:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_5.setBounds(38, 274, 164, 40);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("HTML");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		rdbtnNewRadioButton.setBounds(38, 335, 103, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plane Text");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		rdbtnNewRadioButton_1.setBounds(168, 335, 176, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Custom");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		rdbtnNewRadioButton_2.setBounds(363, 335, 128, 21);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton.setBounds(757, 106, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_1.setBounds(761, 165, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton_2.setBounds(762, 218, 115, 21);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 659, 887, 60);
		contentPane.add(panel_2);
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_2.add(btnNewButton_4);
	}
}

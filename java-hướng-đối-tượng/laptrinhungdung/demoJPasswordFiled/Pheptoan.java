package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class Pheptoan extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pheptoan frame = new Pheptoan();
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
	public Pheptoan() {
		setBackground(Color.CYAN);
		setTitle("C\u1ED8NG-TR\u1EEA-NH\u00C2N-CHIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(8, 18, 838, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u1ED8NG TR\u1EEA NH\u00C2N CHIA");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(266, 11, 274, 49);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(13, 108, 154, 386);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CH\u1ECCN T\u00C1C V\u1EE4", TitledBorder.LEFT, TitledBorder.TOP, null, Color.RED));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("GI\u1EA2I");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	sa=txta.getText();
				int a=0,b=0;
				try{
				a=Integer.parseInt(sa);
				}
				catch(Exception	ex)
				{
				JOptionPane.showMessageDialog(null,	
				"a nhập sai định dạng!");
				txta.selectAll();
				txta.requestFocus();
				return;
				}
				String	sb=txtb.getText();
				try{
				b=Integer.parseInt(sb);
				}catch(Exception	ex)
				{JOptionPane.showMessageDialog(null,	
						"b nhập sai định dạng!");
				txtb.selectAll();
				txtb.requestFocus();
				return;
				}
				double kq=0;
				if(Pheptoan.isSelected()){
					textField.setText(Double.toString(a+b));
				}
				else if(Pheptoan.isSelected()){
					textField.setText(Double.toString(a-b));
				}
				else if(Pheptoan.isSelected()){
					textField.setText(Double.toString(a*b));
				}
				else{
					textField.setText(Double.toString(a/b));
				}
				textField.setText(kq+"");
			}
		});
		btnNewButton.setBounds(10, 88, 81, 37);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X\u00D3A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setText("");
				txtb.setText("");
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(10, 175, 71, 33);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THO\u00C1T");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 251, 97, 33);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(188, 123, 655, 373);
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("nh\u1EADp a:");
		lblNewLabel_1.setBounds(96, 46, 87, 33);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);
		
		txta = new JTextField();
		txta.setBounds(206, 46, 228, 33);
		panel_2.add(txta);
		txta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("nh\u1EADp b:");
		lblNewLabel_2.setBounds(96, 117, 87, 33);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		txtb = new JTextField();
		txtb.setBounds(206, 124, 228, 33);
		panel_2.add(txtb);
		txtb.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(206, 186, 207, 88);
		panel_2.add(panel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("C\u1ED9ng");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnNewRadioButton) {
					Double a=Double.parseDouble(txta.getText());
					Double b=Double.parseDouble(txtb.getText());
					textField.setText(Double.toString(a+b));
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tr\u1EEB");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnNewRadioButton_1) {
					Double a=Double.parseDouble(txta.getText());
					Double b=Double.parseDouble(txtb.getText());
					textField.setText(Double.toString(a-b));
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nh\u00E2n");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnNewRadioButton_2) {
					Double a=Double.parseDouble(txta.getText());
					Double b=Double.parseDouble(txtb.getText());
					textField.setText(Double.toString(a*b));
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Chia");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnNewRadioButton_3) {
					Double a=Double.parseDouble(txta.getText());
					Double b=Double.parseDouble(txtb.getText());
					textField.setText(Double.toString(a/b));
				}
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("k\u1EBFt qu\u1EA3:");
		lblNewLabel_3.setBounds(96, 319, 87, 29);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(206, 319, 228, 29);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "ch\u1ECDn ph\u00E9p to\u00E1n", TitledBorder.LEFT, TitledBorder.TOP, null, Color.RED));
		panel_6.setBounds(205, 172, 209, 104);
		panel_2.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(20, 513, 819, 38);
		panel_4.setBackground(Color.ORANGE);
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setHgap(20);
		contentPane.add(panel_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBackground(Color.YELLOW);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBackground(Color.BLUE);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBackground(Color.RED);
		panel_4.add(btnNewButton_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(Color.WHITE);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "nh\u1EADp hai s\u1ED1 a v\u00E0 b", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_5.setBounds(185, 106, 661, 394);
		contentPane.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
	}

	protected static boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
}

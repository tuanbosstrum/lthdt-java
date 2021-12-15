package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;

public class evenOld extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					evenOld frame = new evenOld();
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
	public evenOld() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(208, 26, 506, 68);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("NH\u1EACP M\u1ED8T S\u1ED0 NGUY\u00CAN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(25);
		panel_1.setBounds(148, 185, 619, 131);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Integer so = Integer.parseInt(textField.getText());
				String result="So nhap vao la so" +((so%2==0)? "chan": "le");
				JOptionPane.showMessageDialog(rootPane, result, "Output", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CANCEL");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer so = Integer.parseInt(textField.getText());
				String result="So nhap vao la so" +((so%2==0)? "chan": "le");
				textField.setText("");
				JOptionPane.showConfirmDialog(null,	"Tiếp tục không?", "Select an Option?",JOptionPane.YES_NO_CANCEL_OPTION);
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(btnNewButton_2);
	}
}

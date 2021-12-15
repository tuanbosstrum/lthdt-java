package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Hienthi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hienthi frame = new Hienthi();
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
	public Hienthi() {
		setTitle("Book infomation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 7, 738, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Filer", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(16, 24, 525, 114);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(27, 35, 88, 38);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(139, 35, 263, 38);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		panel_2.setBounds(567, 32, 152, 100);
		panel.add(panel_2);
		
		JButton btnNewButton = new JButton("List");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(19, 153, 703, 373);
		panel.add(panel_3);
	}
}

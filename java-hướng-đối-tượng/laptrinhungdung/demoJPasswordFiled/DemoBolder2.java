package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class DemoBolder2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoBolder2 frame = new DemoBolder2();
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
	public DemoBolder2() {
		setTitle("Border Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.RED));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(10);
		panel.setBounds(8, 29, 335, 76);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Line Border");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(356, 30, 313, 75);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Etched Border");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 129, 333, 66);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Raised Bevel Border");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(359, 132, 310, 63);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Lowerd Bevel Border");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Tilte", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_4.setBounds(8, 228, 335, 63);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("Titled Border");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Title", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel_5.setBounds(356, 228, 308, 63);
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("Titled Border(right)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(8, 329, 335, 66);
		contentPane.add(panel_6);
		
		JLabel lblNewLabel_6 = new JLabel("Compound Border");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		panel_7.setBounds(356, 329, 310, 66);
		contentPane.add(panel_7);
		
		JLabel lblNewLabel_7 = new JLabel("Matte Border");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_7.add(lblNewLabel_7);
	}
}

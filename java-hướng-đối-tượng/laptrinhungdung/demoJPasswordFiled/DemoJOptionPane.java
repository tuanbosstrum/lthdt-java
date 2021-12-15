package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoJOptionPane extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoJOptionPane frame = new DemoJOptionPane();
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
	public DemoJOptionPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 643);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(4, 66, 747, 101);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Demo s\u1EED d\u1EE5ng h\u1ED9p tho\u1EA1i");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(50);
		panel_1.setBounds(4, 221, 752, 86);
		getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "ban vua nhan nut OK");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Yes, please",
	                    "No, thanks",
	                    "Nothing!"};
		int n = JOptionPane.showOptionDialog(btnNewButton,
	    "Ban muon thoat khoi chuong trinh khong? "
	    + "with that ham?",
	    "A Silly Question",
	    JOptionPane.YES_NO_CANCEL_OPTION,
	    JOptionPane.QUESTION_MESSAGE,
	    null,
	    options,
	    options[2]);
				panel_1.add(btnNewButton_1);
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setHgap(25);
		panel_2.setBounds(0, 360, 759, 93);
		getContentPane().add(panel_2);
		
		JButton btnNewButton_2 = new JButton("Input");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "hay nhap du lieu bạn muon!");
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Error");
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		JOptionPane.showMessageDialog(btnNewButton,
			    "Thong bao loi!",
			    "Inane error",
			    JOptionPane.ERROR_MESSAGE);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		Object[] options = {"Yes, please",
                "No, thanks",
                "Nothing!"};
				int n = JOptionPane.showOptionDialog(btnNewButton,
						"Ban muon tiep tuc chu? "
								+ "with that ham?",
								"A Silly Question",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[2]);
		panel_2.add(btnNewButton_4);
	}

}

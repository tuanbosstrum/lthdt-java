package demoJPasswordFiled;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DemoJSlider extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoJSlider frame = new DemoJSlider();
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
	public DemoJSlider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(50);
		panel.setBounds(4, 6, 384, 554);
		contentPane.add(panel);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slider.setForeground(Color.RED);
		slider.setMajorTickSpacing(50);
		slider.setMaximum(250);
		slider.setMinorTickSpacing(20);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		panel.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slider_1.setValue(250);
		slider_1.setForeground(Color.RED);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(20);
		slider_1.setMaximum(250);
		slider_1.setMajorTickSpacing(50);
		panel.add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setMinorTickSpacing(20);
		slider_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		slider_2.setForeground(Color.RED);
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setValue(0);
		slider_2.setMajorTickSpacing(50);
		slider_2.setMaximum(250);
		panel.add(slider_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(399, 8, 450, 544);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\images\\oppof11_files\\oppo-f11-mtp-400x460.png"));
		panel_1.add(lblNewLabel);
	}
}

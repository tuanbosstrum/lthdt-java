package DEMO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFullname;

	private JTextField textEmail;
	private JTextField textAge;
	private JTable tableStudent;
	private DefaultTableModel tableModel;
	List<Student> list = new ArrayList<>();
	private JComboBox cbGender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentJFrame frame = new StudentJFrame();
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
	public StudentJFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 595, 249);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblFullname = new JLabel("Full name:");
		lblFullname.setBounds(10, 24, 124, 32);
		panel.add(lblFullname);
		lblFullname.setFont(new Font("Times New Roman", Font.BOLD, 14));

		textFullname = new JTextField();
		textFullname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textFullname.setBounds(158, 24, 426, 32);
		panel.add(textFullname);
		textFullname.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 111, 124, 32);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));

		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 165, 124, 32);
		panel.add(lblAge);
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 14));

		textEmail = new JTextField();
		textEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textEmail.setBounds(158, 111, 426, 32);
		panel.add(textEmail);
		textEmail.setColumns(10);

		textAge = new JTextField();
		textAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textAge.setBounds(158, 165, 426, 32);
		panel.add(textAge);
		textAge.setColumns(10);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGender.setBounds(10, 67, 124, 32);
		panel.add(lblGender);

		cbGender = new JComboBox();
		cbGender.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		cbGender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbGender.setBounds(158, 67, 86, 33);
		panel.add(cbGender);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullname = textFullname.getText();
				String gender = cbGender.getSelectedItem().toString();
				String email = textEmail.getText();
				int age = Integer.parseInt(textAge.getText());
				Student std = new Student(fullname, gender, email, age);
				StudentController.insert(std);
				ShowStudent();

			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSave.setBounds(168, 214, 89, 23);
		panel.add(btnSave);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFullname.setText("");
				cbGender.setSelectedIndex(0);
				textEmail.setText("");
				textAge.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(280, 214, 89, 23);
		panel.add(btnReset);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = tableStudent.getSelectedRow();
				if (selected >= 0) {
					Student std = list.get(selected);
					int op = JOptionPane.showConfirmDialog(null, "Are you sure :< ?");
					if (op == 0) {
						StudentController.delete(std.getId());
						ShowStudent();
					}
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.setBounds(389, 215, 89, 23);
		panel.add(btnDelete);

		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog(this, "Nhap fullname");
				if (input != null && input.length() > 0) {
					JOptionPane.showMessageDialog(null, "thanh cong");
					list = StudentController.findbyFullname(input);
					tableModel.setRowCount(0);
					for (Student std : list) {
						tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, std.getFullname(),
								std.getGender(), std.getEmail(), std.getAge() });
					}
				} else {
					ShowStudent();
				}
			}
		});
		btnFind.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFind.setBounds(492, 215, 89, 23);
		panel.add(btnFind);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 275, 595, 155);
		contentPane.add(scrollPane);

		tableStudent = new JTable();
		tableStudent.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Fullname", "Gender", "Email", "Age" }));
		tableStudent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		scrollPane.setViewportView(tableStudent);
		tableModel = (DefaultTableModel) tableStudent.getModel();
		ShowStudent();
	}

	private void ShowStudent() {
		list = StudentController.findAll();
		tableModel.setRowCount(0);
		for (Student std : list) {
			tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, std.getFullname(), std.getGender(),
					std.getEmail(), std.getAge() });
		}
	}
}

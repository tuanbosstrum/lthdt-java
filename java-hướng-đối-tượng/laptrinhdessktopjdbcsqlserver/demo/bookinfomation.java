package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class bookinfomation extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitle;
	private String header[] = {"ID", "Title", "Price"};
	private DefaultTableModel tblModel;
	private JTable BookTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookinfomation frame = new bookinfomation();
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
	public bookinfomation() {
		setTitle("Bookinfomation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(10, 10, 729, 529);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBorder(new TitledBorder(null, "filer", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 17, 420, 94);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 20, 82, 46);
		panel_1.add(lblNewLabel);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(130, 24, 242, 37);
		panel_1.add(txtTitle);
		txtTitle.setColumns(10);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnList.setBackground(new Color(175, 238, 238));
		
		btnList.setFont(new Font("Arial", Font.BOLD, 20));
		btnList.setBounds(534, 21, 127, 33);
		panel.add(btnList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(175, 238, 238));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int note = JOptionPane.showInternalConfirmDialog(null,  "bạn muốn thoát không? ","Exit",JOptionPane.YES_NO_OPTION );
				if(note == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 20));
		btnExit.setBounds(534, 85, 127, 33);
		panel.add(btnExit);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFind.setBackground(new Color(154, 205, 50));

		btnFind.setFont(new Font("Arial", Font.BOLD, 20));
		btnFind.setBounds(547, 485, 115, 31);
		panel.add(btnFind);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 121, 709, 362);
		panel.add(scrollPane);
		
		BookTable = new JTable();
		BookTable.setForeground(new Color(95,158,160));
		BookTable.setBackground(SystemColor.menu);
		BookTable.setRowSelectionAllowed(false);
		BookTable.setBorder(new CompoundBorder());
		BookTable.setFont(new Font("tahoma", Font.PLAIN, 16));
		BookTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"ID", "Title", "Price"
			}
		));
		BookTable.getColumnModel().getColumn(0).setPreferredWidth(79);
		BookTable.getColumnModel().getColumn(1).setPreferredWidth(83);
		BookTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		scrollPane.setColumnHeaderView(BookTable);
		
		//hiển thị lên Jtable
		tblModel = (DefaultTableModel) BookTable.getModel();
		showBooks();
	}

	private void showBooks() {
		List<Books> ds = BookController.getAllBook();
		tblModel.setRowCount(0);
		for(Books book : ds) {
			tblModel.addRow(new Object[] {
					tblModel.getRowCount() + 1, book.getTitle(), book.getPrice()
			});
		}
	}
}

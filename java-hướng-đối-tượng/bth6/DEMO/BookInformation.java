package DEMO;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


public class BookInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable BookTable;
	private DefaultTableModel dfModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInformation frame = new BookInformation();
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
	public BookInformation() {
		setBackground(SystemColor.menu);
		setTitle("Book Information ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(10, 10, 517, 437);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Filter",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 21, 341, 111);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Rockwell", Font.PLAIN, 18));
		lblTitle.setBounds(10, 42, 51, 30);
		panel_1.add(lblTitle);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(71, 42, 255, 33);
		panel_1.add(textField);
		textField.setColumns(10);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(7);
		panel_2.setBounds(361, 21, 146, 111);
		panel.add(panel_2);

		JButton btnList = new JButton("   LIST   ");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnList.setForeground(new Color(255, 51, 153));
		btnList.setBackground(new Color(255, 204, 102));
		btnList.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		panel_2.add(btnList);

		JButton btnFind = new JButton("   FIND  ");
		btnFind.setForeground(new Color(102, 51, 204));
		btnFind.setBackground(new Color(255, 204, 255));
		btnFind.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		panel_2.add(btnFind);

		JButton btnExit = new JButton("   EXIT   ");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int note = JOptionPane.showInternalConfirmDialog(null, "Bạn có muốn thoát không?", "Exit",
						JOptionPane.YES_NO_OPTION);
				if (note == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(51, 0, 255));
		btnExit.setBackground(new Color(102, 204, 204));
		btnExit.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		panel_2.add(btnExit);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 497, 271);
		panel.add(scrollPane);

		BookTable = new JTable();
		BookTable.setForeground(new Color(95, 158, 160));
		BookTable.setBackground(SystemColor.menu);
		BookTable.setRowSelectionAllowed(false);
		BookTable.setBorder(new CompoundBorder());
		BookTable.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BookTable.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "ID", "Title", "Price" }));
		BookTable.getColumnModel().getColumn(0).setPreferredWidth(79);
		BookTable.getColumnModel().getColumn(1).setPreferredWidth(83);
		BookTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		scrollPane.setViewportView(BookTable);
		
		
		//Hiển thị lên Jtable
		dfModel = (DefaultTableModel) BookTable.getModel();
		showBooks();
	}
	
	private void showBooks() {
		List<SACH> ds = BookControl.getAllBook();
		dfModel.setRowCount(0);
		for (SACH book : ds) {
			dfModel.addRow(new Object[] 
					{ dfModel.getRowCount() + 1, book.getTitle(), book.getPrice() });
		}

	}

}

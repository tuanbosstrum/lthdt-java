package demoJPasswordFiled;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
public class Account {
JFrame myFrame=new JFrame("Account");
JTextField txtAccNumber;
JTextField txtAccName;
JTextField txtAccMoney;
JTable tblAcc;
DefaultTableModel tblModelAcc;
JButton btnAdd,btnClear,btnExit;
public Account() {
	JPanel pnAccNumber=new JPanel();
	pnAccNumber.setLayout(new BoxLayout(pnAccNumber, BoxLayout.X_AXIS));
	JLabel lblAccNumber=new JLabel("Account Number:");
	pnAccNumber.add(lblAccNumber);
	txtAccNumber=new JTextField(15);
	pnAccNumber.add(txtAccNumber);
	
	JPanel pnAccName=new JPanel();
	pnAccName.setLayout(new BoxLayout(pnAccName, BoxLayout.X_AXIS));
	JLabel lblAccName=new JLabel("Account Name:");
	pnAccName.add(lblAccName);
	txtAccName=new JTextField(15);
	pnAccName.add(txtAccName);
	
	JPanel pnAccMoney=new JPanel();
	pnAccMoney.setLayout(new BoxLayout(pnAccMoney, BoxLayout.X_AXIS));
	JLabel lblAccMoney=new JLabel("Account Money:");
	pnAccMoney.add(lblAccMoney);
	txtAccMoney=new JTextField(15);
	pnAccMoney.add(txtAccMoney);
	Container con=myFrame.getContentPane();
	con.setLayout(new BorderLayout());
	
	JPanel pInfor=new JPanel();
	pInfor.setLayout(new BoxLayout(pInfor, BoxLayout.Y_AXIS));
	pInfor.add(pnAccNumber);
	pInfor.add(pnAccName);
	pInfor.add(pnAccMoney);
	con.add(pInfor,BorderLayout.NORTH);
	tblModelAcc=new DefaultTableModel();
	tblModelAcc.addColumn("Acc Number");
	tblModelAcc.addColumn("Acc Name");
	tblModelAcc.addColumn("Acc Money");
	tblAcc=new JTable(tblModelAcc);
	JScrollPane sc=new JScrollPane(tblAcc,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	con.add(sc,BorderLayout.WEST);
	JPanel pnButton=new JPanel();
	btnAdd=new JButton("Add");
	btnAdd.setMnemonic('A');
	btnClear=new JButton("Clear");
	btnClear.setMnemonic('C');
	btnExit=new JButton("Exit");
	btnExit.setMnemonic('E');
	pnButton.add(btnAdd);
	pnButton.add(btnClear);
	pnButton.add(btnExit);
	con.add(pnButton,BorderLayout.SOUTH);
	lblAccName.setPreferredSize(lblAccNumber.getPreferredSize());
	lblAccMoney.setPreferredSize(lblAccNumber.getPreferredSize());
	addEvents();
	}
		public void addEvents() {
			btnAdd.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String arr[]={txtAccNumber.getText(),
							txtAccName.getText(),
							txtAccMoney.getText()};
					tblModelAcc.addRow(arr);
				}
			});
			btnExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int ret=JOptionPane.showConfirmDialog(null,
							"Are you sure you want to exit?", "Exit!",
							JOptionPane.YES_NO_OPTION);
					if(ret==JOptionPane.YES_OPTION)
						System.exit(0);
				}
			});
		}
		public void doShow(){
			myFrame.setSize(400, 300);
			myFrame.setLocationRelativeTo(null);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);
	}
}
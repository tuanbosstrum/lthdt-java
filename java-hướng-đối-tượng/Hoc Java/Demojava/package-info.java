package Demojava;
import javax.swing.JFrame;
public class anhtuan extends JFrame { 
	JFrame f;
	public anhtuan() {
		f = new JFrame();
	 	f.setTitle("AnhTuan");
		f.setSize(250,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setLocation(300,200);
		f.setLocationRelativeTo(null);
		f.setResizable(true);
 }
}
package DUAN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuyenManHinh {
	private JPanel root;
    private String kindSelected = "";
private Iterable<DanhMuc> listItem;

public ChuyenManHinh(JPanel jpnRoot) {
    this.root = jpnRoot;
}

    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jpnItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }
public void setEvent(List <DanhMuc> listItem){
    this.listItem = listItem;
    for(DanhMuc item: listItem){
        item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
    }
}
class LabelEvent implements MouseListener{
    private JPanel node;
    private String kind;
    
    private JPanel jpnItem;
    private JLabel jlbItem;

    public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
        this.kind = kind;
        this.jpnItem = jpnItem;
        this.jlbItem = jlbItem;
    }

    public void mouseClicked(MouseEvent e) {
        switch(kind){
            case "TrangChu":
                node = new TrangChuJPanel();
                break;
            case "HocVien":
                node = new HocVienJPanel();
                break;
            case "KhoaHoc":
                node = new KhoaHocJPanel();
                break;
            default:
                node = new TrangChuJPanel();
                break;
        }
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
        setChangeBackground(kind);
    }
    public void mousePressed(MouseEvent e) {
       kindSelected = kind;
       jpnItem.setBackground(new Color(96,100,191));
       jlbItem.setBackground(new Color(96,100,191));
    }
    public void mouseReleased(MouseEvent e) {
      
    }
    public void mouseEntered(MouseEvent e) {
       jpnItem.setBackground(new Color(96,100,191));
       jlbItem.setBackground(new Color(96,100,191));
    }
    public void mouseExited(MouseEvent e) {
        if(!kindSelected.equalsIgnoreCase(kind)){
           jpnItem.setBackground(new Color(76,175,80));
           jlbItem.setBackground(new Color(76,175,80));
            
        }
    }
    
}
private void setChangeBackground(String kind){
    for(DanhMuc item : listItem){
        if(item.getKind().equalsIgnoreCase(kind)){
            item.getJpn().setBackground(new Color(96,100,91));
            item.getJlb().setBackground(new Color(96,100,91));
        }else{
             item.getJpn().setBackground(new Color(76,175,80));
             item.getJlb().setBackground(new Color(76,175,80));
        }
    }
}
}

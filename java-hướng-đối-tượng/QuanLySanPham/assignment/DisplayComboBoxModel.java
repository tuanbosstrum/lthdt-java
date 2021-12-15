package assignment;

public class DisplayComboBoxModel {
	public Object DisplayMember;
    public Object DisplayValue;
    public DisplayComboBoxModel(String member, String value){
        DisplayMember = member;
        DisplayValue = value;
    }
    
    public String toString(){
        return DisplayMember.toString();
    }
}

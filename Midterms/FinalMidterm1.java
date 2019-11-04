import javax.swing.JOptionPane;

public class FinalMidterm1 {
	
	public static void main (String []args) {
		
		int minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minutes:", "Minutes", JOptionPane.INFORMATION_MESSAGE));
		int hours, min;
		
		hours = minutes/60;
		min = minutes%60;
		JOptionPane.showMessageDialog(null,"There are " + hours + " hours " + min + " minutes");
		
	}
}

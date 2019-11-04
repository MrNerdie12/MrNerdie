import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.text.DecimalFormat;

public class FinalMidterm2 {
	
	public static void main (String args []) {
	
		double num1, num2, area;
		String opt;
		DecimalFormat df = new DecimalFormat("0.00");
		boolean cond = true, cond1 = true,cond2 = true;
		
		while (cond1) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				Object[] choices = { "Circle", "Square", "Rectangle", "Triangle"};
				String initialSelection = null;
				Object selection = JOptionPane.showInputDialog(null, "SELECT SHAPE", "SELECTION", JOptionPane.QUESTION_MESSAGE, null, choices, initialSelection);
			while (cond) {
				try {	
						if (selection.equals(choices[0])) {
							num1 = Double.parseDouble(JOptionPane.showInputDialog(choices[0] + " selected\nEnter Radius"));
							area = Math.PI * (num1 * num1);
							JOptionPane.showMessageDialog(null, "Area of Circle is: " + df.format(area));
							break;
						}	
						else if (selection.equals(choices[1])) {
							num1 = Double.parseDouble(JOptionPane.showInputDialog(choices[1] + " selected\nEnter Side"));
							area = num1 * num1;
							JOptionPane.showMessageDialog(null, "Area of Square is: " + df.format(area));
							break;
						}
						else if (selection.equals(choices[2])) {
							num1 = Double.parseDouble(JOptionPane.showInputDialog(choices[2] + " selected\nEnter length"));
							num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Width"));
							area = num1 * num2;
							JOptionPane.showMessageDialog(null, "Area of Rectangle is: " + df.format(area));
							break;
						}	
							
						else if (selection.equals(choices[3])) {
							num1 = Double.parseDouble(JOptionPane.showInputDialog(choices[3] + " selected\nEnter Height"));
							num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Base"));
							area = (num2 * num1) / 2;
							JOptionPane.showMessageDialog(null, "Area of Triangle is: " + df.format(area));
							break;
					}
				}
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INVALID INPUT", "WARNING", JOptionPane.ERROR_MESSAGE);
					cond = true;
					
				}
			}
			while (cond2) {
				opt = JOptionPane.showInputDialog("TRY AGAIN? [Y/N]");
				if (opt.equalsIgnoreCase("Y")) {
					cond1 = true;
					break;
				}
				else if (opt.equalsIgnoreCase("N")) {
					JOptionPane.showMessageDialog(null, "EXITTING NOW", "Exit", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Input", "Try Again", JOptionPane.ERROR_MESSAGE);
					cond2 = true;
				}
			}
		}
	}
}

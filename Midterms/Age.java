import javax.swing.JOptionPane;
	
	public class Age {
	
		public static void main (String ards []) {
	
			boolean condition = true;
			String age1;
				
			while(condition) {
					
				
				try {
					age1 = JOptionPane.showInputDialog("Enter your age");
				
					if (age1 == null) {
						JOptionPane.showMessageDialog(null, "EXIT", "CANCEL PRESSED", JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					else if (age1 != null) {
						 int age = Integer.parseInt(age1);
								if (age >= 0 && age <= 3) {
									JOptionPane.showMessageDialog(null, "You are a baby");
									break;
								}
								else if (age >= 4 && age  <= 12) {
									JOptionPane.showMessageDialog(null, "You are a child");
									break;
								}
								else if (age >= 13 && age  <= 19) {
									JOptionPane.showMessageDialog(null, "You are a teen");
									break;
								}
								else if (age >= 20  && age  <= 32) {
									JOptionPane.showMessageDialog(null, "You are a young adult");
									break;
								}
								else if (age >= 33 && age  <= 45) {
									JOptionPane.showMessageDialog(null, "You are a middle aged person");
									break;
								}
								else if (age >= 46 && age  <= 59) {
									JOptionPane.showMessageDialog(null, "You are a adult");
									break;
								}
								else if (age >= 60 && age  <= 122) {
									JOptionPane.showMessageDialog(null, "You are a senior");
									break;
								}
								else {
									JOptionPane.showMessageDialog(null, "Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
								}
					}
				}
			catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INVALID INPUT", "WARNING", JOptionPane.ERROR_MESSAGE);
					condition = true;
			}
		}
	}
}

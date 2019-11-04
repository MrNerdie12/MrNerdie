import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FinalActivity {

        public static void main(String[] args) {

        int weeklyGross, employee = 1, ctr = 1;

        double weeklyBonus;

        char classLabel = ' ';

        DecimalFormat df = new DecimalFormat("0.00");

        double payRange[] = new double [9];

        char label[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        int classCount[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("---------- SIMULATION START ----------");

        try {

        for (int x = 0; x < (employee + 7); x++) {

        weeklyGross = Integer.parseInt(JOptionPane.showInputDialog(null, "Employee " + (x+1) + " Gross"));

        if (weeklyGross < 0 || weeklyGross < 100000) {

        weeklyBonus = (double)weeklyGross * 0.09;

        payRange[x] = weeklyBonus + 200;

        if (payRange[x] >= 200 && payRange[x] <= 299) {

        classLabel = label[0];

        ctr++;

        classCount[0]++;

        }

        else if (payRange[x] >= 300 && payRange[x] <= 399) {

        classLabel = label[1];

        ctr++;

        classCount[1]++;

        }

        else if (payRange[x] >= 400 && payRange[x] <= 499) {

        classLabel = label[2];

        ctr++;

        classCount[2]++;

        }

        else if (payRange[x] >= 500 && payRange[x] <= 599) {

        classLabel = label[3];

        ctr++;

        classCount[3]++;

        }

        else if (payRange[x] >= 600 && payRange[x] <= 699) {

        classLabel = label[4];

        ctr++;

        classCount[4]++;

        }

        else if (payRange[x] >= 700 && payRange[x] <= 799) {

        classLabel = label[5];

        ctr++;

        classCount[5]++;

        }

        else if (payRange[x] >= 800 && payRange[x] <= 899) {

        classLabel = label[6];

        ctr++;

        classCount[6]++;

        }

        else if (payRange[x] >= 900 && payRange[x] <= 999) {

        classLabel = label[7];

        ctr++;

        classCount[7]++;

        }

        else if (payRange[x] > 1000) {

        classLabel = label[8];

        ctr++;

        classCount[8]++;

        }

        System.out.println("Employee #" + (x+1));

        System.out.println("Week Gross " + (x+1) + ": " + df.format(weeklyGross));

        System.out.println("Week Bonus " + (x+1) + ": " + df.format(weeklyBonus));

        System.out.println("Week Total " + (x+1) + ": " + df.format(payRange[x]));

        System.out.println("Calssification " + (x+1) + ": " + classLabel);

        System.out.println("----------");

        employee = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new employee?\n[1] Yes\n[2] No"));

        if (employee == 1)

        employee = employee + 1;

        else {

        for (x = 0; x < 9;x++) {

        System.out.println("There are " + classCount[x] + " in Classification " + label[x]);

        }

        System.out.println("---------- SIMULATION SUCCESSFUL ----------");

        }

        }

        else {

        System.out.println("---------- SIMULATION FAILED ----------");

        }

        }

        }

        catch (NumberFormatException ex) {

        System.out.println("---------- SIMULATION FAILED ----------");

        System.exit(0);

        }

        }

}

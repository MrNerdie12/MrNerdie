package arraysort;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ArraySort {

    public static void main(String[] args) {
        
        int size, i, x, temp, sum = 0;
        double mean;
        Scanner jai = new Scanner(System.in);
        DecimalFormat carlo = new DecimalFormat("0.00");
        
        System.out.println("Enter size of Array: ");
        size = jai.nextInt();
        int [] a = new int [size];
        for (x = 0; x < size; x++) {
            System.out.println("Enter Element " + x);
            a[x] = jai.nextInt();
            sum += a[x];
        }
        
        System.out.println("Unordered list: ");
        for (x = 0; x < size; x++) {
            System.out.print(a[x] + "\t");
        }
        
        System.out.println("\nOrdered List: ");
        for (x = 0; x < size; x++) {
            for (i = 0; i < size; i++) {
                if (a[i] > a[x]) {
                    temp = a[i];
                    a[i] = a[x];
                    a[x] = temp;
                }
            }
        }
        
        for (x = 0; x < size; x++) {
            System.out.print(a[x] + "\t");
        }
        
        mean = (double)sum / (double)size;
        System.out.println("\nMean: " + carlo.format(mean));
        
        
    }
    
}

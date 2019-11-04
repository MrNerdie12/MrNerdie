import java.util.Scanner;

public class CC2_Lab3User {
 
  public static void main (String []args) {
 
    String name;
    char exc = '!';
    int excNum = exc;
    int sum = 0 + exc;
    int product = 1;
    int prod1 = 1 * exc;
    int average = 0;
    int remainder = 0;
   
    Scanner text = new Scanner(System.in);

    System.out.println("Enter your Name:");
    name = text.nextLine();
    int length = name.length();
   
    for (int x = 0; x < length; x++) {
      char charName = name.charAt(x);
      int value = (int)charName;
      System.out.println(charName + " - " + value);
     
      sum = sum + charName;
      product = (product * charName);
      average = sum / length;
      remainder = product % average;
    }

    System.out.println(exc + " - " + excNum);
    System.out.println(name + exc);
    System.out.println("Sum is: " + sum);
    System.out.println("Product is: " + product);
    System.out.println("Average is: " + average);
    System.out.println("Remainder is: " + remainder);
  }
}

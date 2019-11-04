import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AgeBuff {
 
    public static void main (String []args) {
       
       
        while (true) {
            try {
                int age;
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       			System.out.print("Input Age ");
       			age = Integer.parseInt(in.readLine());
       			
                    if (age >= 0 && age <= 3) {
                        System.out.println("You are a baby " + age + " yrs old");
                        break;
                    }
                    else if (age >= 4 && age <= 12) {
                        System.out.println("You are a child " + age + " yrs old");
                        break;
                    }
                    else if (age >= 13 && age <= 19) {
                        System.out.println("You are a teen " + age + " yrs old");
                        break;
                    }
                    else if (age >= 20 && age <= 32) {
                        System.out.println("You are a young adult " + age + " yrs old");
                        break;
                    }
                    else if (age >= 33 && age <= 45) {
                    	System.out.println("You are a middle aged person " + age + " yrs old");
                        break;
                    }
                    else if (age >= 46 && age <= 59) {
                        System.out.println("You are a adult " + age + " yrs old");
                        break;
                    }
                    else if (age >= 60 && age <= 122) {
                        System.out.println("You are a senior " + age + " yrs old");
                        break;
                    }
                    else if (age < 0 || age > 122)
                        System.out.println("Try Again");
            }
            catch (Exception e) {
                System.out.println("INVALID INPUT");
			}
		}	
	}
}

public class VariablesAndDataTypes {

	public static void main (String []args) {
	
		String sentence = "The temperature in Baguio City has warmed throuighout the years.";
		boolean a = true;
		char letter = 'A';
		float firstNum = 16;
		double secondNum = 23.5;
		byte num1 = 24;
		short num2 = 7;
		int num3 = 4;
		long num4 = 12;
		
		if (a){
      System.out.print(sentence + "\n\t" + letter + " recent news article stated that the City has been averaging " + firstNum 
      + " degrees celsius at dawn and " + secondNum + " at noon.\n\t\t" + "Regardless, lowlanders still feel cold " 
      + num1+ " hours a day, " + num2 + " days a week, " + num3 + " weeks a month and " + num4 + " months each year.");
		}
		
		else{
      System.out.print("The boolean value was changed to False value.");
    }
	
	}
}

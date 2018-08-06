/*Author: Jaime Maldonado
Program fills applications in with different data.
Shows usage and manipulation of data via arrays.
*/

import java.util.Scanner;

public class ValidNumbers {
	public static void main(String[] args) {
		
		//Array and variable intialized and defined
		int choice = 0;
		int[] choiceArray = new int[5];
		int uniqueNumsCounted = 0;
		int[] uniqueArray = new int[5];
		boolean validNum = false, uniqueNumber = false;
		
		//For loop to ask user for input.
		for (int i = 0; i < choiceArray.length; i++) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter an integer between 50-100: ");
			choice = userInput.nextInt();//Input placed in choice variable.
			validNum = checkValidity(choice);//User input sent to checkValidity method for validity.
			
			//While not true user choice.
			while (!validNum) {
				choice = userInput.nextInt();
				validNum = checkValidity(choice);
			}
			
			//Collects choices and places them into eaach index of array.
			choiceArray[i] = choice;
			uniqueNumber = checkUnique(choice, uniqueArray);
			
			//If uniqueness is valid then choice (uniqueNumber) is added to uniqueArray.
			if (uniqueNumber) {
				
				//UniqueArray keeps track of unique numbers while uniqueNumsCountedd keeps count.
				uniqueArray[uniqueNumsCounted++] = choice;
			}
			
			//Keeps user prompted on number of unique so far.
			System.out.printf("Unique so far: \t"+uniqueNumsCounted);
			for (int j = 0; j < uniqueNumsCounted; j++) {
				
				//Prints out the current number of objects in array.
				System.out.printf("\t" +uniqueArray[j]);
			}
			System.out.println();
		} // End for loop
		
		//End alert with total unique numbers entered.
		System.out.printf("You Entered "+uniqueNumsCounted+" Unique Valid Numbers");
		for (int j = 0; j < uniqueNumsCounted; j++) {
			System.out.printf("\t", +uniqueArray[j]);
		}
		System.out.println();	
	}

	//Array to print out choices thus far from userChoiceArray.
	public static void printNums(int[] userChoiceArray) {
		for (int j = 0; j < 5; j++)
			System.out.printf("\t", +userChoiceArray[j]);
		System.out.println();
	}

	//Array that checks for validity (between 50-100). Receives an integer and returns boolean.
	public static boolean checkValidity(int validity) {
		boolean result;
		if (validity >= 50 && validity <= 100) {
			result = true;
		} else {
			result = false;
			System.out.println("***Invalid number. Enter an integer between 50-100:");
		}
		return result;//Returns true or false
	} 

	//Array that checks for uniqueness. Makes sure number entered hasn't already been called.
	public static boolean checkUnique(int choice, int[] array) {
		boolean result = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				if (array[i] == choice) {
					System.out.println("***That's not unique: ");
					result = false;
				}
			}
		} 
		return result;//returns true or false
	}
} 
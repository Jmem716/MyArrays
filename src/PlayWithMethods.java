/*Author: Jaime Maldonado
Program fills applications in with different data.
Shows usage and manipulation of data via arrays.
*/

public class PlayWithMethods {

	public static void main(String[] args) {
		int cubeOfSeven;
		int seven = 7;

		//Cube method called and assigned to variable cubeOfSeven
		cubeOfSeven = cube(seven); 
		outputMessages();
		System.out.println(cubeOfSeven);

		//Array initialized and sent as argument to findAverage method. Average then printed.
		int[] array = { 12, 23, 34, 56 };
		double average = findAverage(array);

		System.out.println("average: " + average);

	}

	public static double findAverage(int[] arrayInMethod) {
		double result;
		int sum = 0;

		for (int i = 0; i < arrayInMethod.length; i++) {
			sum += arrayInMethod[i];
		}
		result = (double) sum / arrayInMethod.length;
		return result;

	}

	//Using print method to display message inside outputMessages method.
	public static void outputMessages() {
		System.out.println("hello");
		System.out.println("from a method");
	}

	public static int cube(int parameter) {
		int result;

		result = parameter * parameter * parameter;
		return result;
	}

}

/*Author: Jaime Maldonado
Program fills applications in with different data.
Shows usage and manipulation of data via arrays.
*/

public class RaggedArray {

	public static void main(String[] args) {
   
		double[][] data = new double [4][];
		data[0] = new double [3];
		data[1] = new double [5];
		data[2] = new double [6];
		data[3] = new double [2];
		
		//For loop fills ragged array with 88.7.
		for(int row = 0; row < data.length; row++){
			for(int col = 0; col < data[row].length; col++){
				data[row][col] = 88.7;
			}
		}
		
		//For loop cycles through each row and prints values out. Begins new line at end of row.
		for(int row = 0; row < data.length; row++){
			for(int col = 0; col < data[row].length; col++){
				System.out.print(data[row][col]+ " ");
			}
			System.out.println();
		}
		
	}
	
}
		
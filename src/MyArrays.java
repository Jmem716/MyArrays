/*Author: Jaime Maldonado
Program fills applications in with different data.
Shows usage and manipulation of data via arrays.
*/

public class MyArrays {

	public static void main(String[] args) {
		
		int[] grades;
		int size = 13;
		
		//Grades array initialized and defined with 13 indexes.
		grades = new int [size]; 
		
		//Index 1 takes 10 away from 99 in original 0 index.
		grades [0] = 99;
		grades [1] = grades[0] - 10; 
		
		for(int i = 0; i < grades.length; i++){

		//Loop fills all 13 indexes with a value of 100 each.
		grades [i] = 100; 
		}
		
		double [] data = new double [100]; 
		
		//Data array filled with random numbers.
		for (int i = 0; i < data.length; i++){
		     data[i] = Math.random();    
	    }

		//Loop prints out all elements in data array.
	    for(double d:data){ 
		     System.out.println(d);
	    }
	    
	    //Data array values sent as argument to findAverage method.
	    double result;
	    result = findAverage(data); 
	    
	    System.out.println("The average is: " +result);
	    
	    //Names array initialized and filled with names.
	    String[] names = new String[4]; 
	    names[0] = "Bob";
	    names[1] = new String("Colin");
	    names[2] = "Jay";
	    names[3] = "Wayne";
	    
	    for(String name: names){
	    	System.out.println(name);
	    }

	}//end main

	static double findAverage(double [] array){
		double average =  0.0, sum = 0.0;
		
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		average = sum / array.length;
		
		return average;
	}
	
}
package gabriel.carlile_chapter_3_examples;

import java.util.Scanner;

/*
 * gabriel carlile
 * 9/18
 * compute the area of a circle 
 */
public class Compute_area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		// step one: enter the radius of a circle 
		//constant declinations 
		double PI = 3.141592653597932384626;
		
		 double radius;
		 double area;
		 
		 // assign a value to a radius
		 System.out.println("Enter the radius of your circle below and press enter:");
		 radius = input.nextDouble();
		 
		
		// step two: compute the area using the following formula:
		// area = radius*radius*pi
		 
		 area = radius*radius*3.14159;
		 
		 System.out.println("the area of your circle is: " + area);
		 
		
		// step three: display result
		
	}

}

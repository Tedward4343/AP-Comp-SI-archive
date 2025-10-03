
/*
Name: Teddy Miller
Block: B
Program: PA10
Date: 9/29/2025
*/



import java.util.*;
public class PA10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gradecount=0;
		double finalgrade=0;
		double gradelol=0; 
		Scanner scan = new Scanner(System.in);
		while (gradelol >= 0) {
		System.out.print("Please enter a grade (type a negative number to stop): ");
		double grading;
			grading = scan.nextDouble();
		if (grading <0) {
			break;
		}
		gradecount ++;
		gradelol = grading;
		finalgrade +=grading;
		}

	
	if (gradecount == 0) {
		System.out.println("No grades found.");
	} else {
		double avg = finalgrade / gradecount;
		System.out.println("Average grade is: " + (int)(avg + 0.5) + "%");
	}
	
	
}
	}



/*
Name: Teddy Miller
Block: B
Program: PA06
Date: 9/10/2025
*/

import java.util.*;

public class PA06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sir, what speed were you going? ");
		int input;
		input = scan.nextInt();
		
		if (input<0) {
			System.out.println("Backing up?");
		}
		else if (input>=0 && input <=60) {
			System.out.println("No Ticket");
		}
		else if (input >=61 && input<=80) {
			System.out.println("A Small Ticket");
		}
		else if (input >=81) {
			System.out.println("A Big Ticket");
		}
		
		
		

		
		
	}

}

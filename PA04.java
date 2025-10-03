/*
Name: Teddy Miller
Block: B
Program: PA02
Date: 8/26/2025
*/



import java.util.*;

public class PA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double Grade1;
		double Grade2;
		Double Grade3;
			System.out.print("Please give me the first grade: ");
			Grade1= scan.nextDouble();
			System.out.print("Please give me the second grade: ");
			Grade2= scan.nextDouble();
			System.out.print("Please give me the third grade: ");
			Grade3= scan.nextDouble();
			int Finalgrade = (int) (Grade1 + Grade2 + Grade3)/3;
			System.out.print("The average of the grades are (rounded down): ");
			System.out.print(Finalgrade);
			System.out.print("%");
	}

}

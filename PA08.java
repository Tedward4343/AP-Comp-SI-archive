/*
Name: Teddy Miller
Block: B
Program: PA08
Date: 8/27/2025
*/
import java.util.*;

public class PA08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.print("Please give me the first number: ");
		int num1;
		num1 = scan.nextInt();
		System.out.print("Please give me the second number: ");
		int num2;
		num2 = scan.nextInt();
		System.out.print("Please give me the third number: ");
		int num3;
		num3 = scan.nextInt();
		
			if (num1<num2 && num2<num3)
				System.out.print("Increasing Order");
				else if (num1> num2 && num2 >num3)
				System.out.print("Decreasing Order");
				else {
					System.out.print("Neither");
				}
		
		

		
		
		
		
	}

}


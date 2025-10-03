/*
Name: Teddy Miller
Block: B
Program: PA02
Date: 8/27/2025
*/


import java.util.*;


public class PA05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double Leash;
		double LeashLength;
		System.out.print("Please give me the length of the leash: ");
		Leash= scan.nextDouble();
		LeashLength = (3.14159*Leash*Leash)*3/4;
		double Leashlengthf;
		Leashlengthf = LeashLength + 0.5;
		Leashlengthf = (int)Leashlengthf;
		int Leas;
		 Leas = (int) Leashlengthf;
		System.out.print("The area Toby has to run around in is: " + Leas + " square feet.");
		
		
	
	
	
	
	}

}

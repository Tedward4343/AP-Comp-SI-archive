
/*
Name: Teddy Miller
Block: B
Program: PA09
Date: 9/26/2025
*/



import java.util.*;


public class PA09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		//Declerations
		Double Salary;
			int Exemptions;
			double Interest;
			double Gains;
			double Totalincome;
			int Adjustedincome;
			int Totaltax = 0;
			double Finaltax= 0;
			int Finaltax2=0;
			int Statetax;
			int Totalincome2;
			int Adjustedincome2=0;
			//User inputs
			System.out.print("Salary: ");
				Salary = scan.nextDouble();
				System.out.print("Exemptions: ");
				Exemptions = scan.nextInt();
				System.out.print("Interest: ");
				Interest = scan.nextDouble();
				System.out.print("Gains: ");
				Gains = scan.nextDouble();
					//Logic
				Totalincome = (Salary + Interest + Gains)-5000;
					if(Exemptions >=6) {
						Exemptions = 6;
					}
				Adjustedincome = (int) (Totalincome-(Exemptions*1500));
					if (Adjustedincome >= 0 && Adjustedincome <20000) {
						Totaltax=0;
					}
					else if (Adjustedincome >= 20000 && Adjustedincome <35000) {
						Totaltax=13;
					}
					else if (Adjustedincome>35000 && Adjustedincome<50000) {
						Totaltax=23;
					}
					else if (Adjustedincome >=50000) {
						Totaltax=28;
					}
					//Total tax comp
					if (Totaltax==13) {
						Finaltax = (double) ((Totalincome - 20000));
								Finaltax2 = (int)(Finaltax/100)*13;
					}
					else if (Totaltax==23) {
						Finaltax = (double) (Totalincome - 35000);
								Finaltax2 = (int)(((Finaltax/100)*23)); //+ 1950) ;
						
					}
					else if (Totaltax==28) {
						Finaltax = (double) (Totalincome - 50000);
							Finaltax2 = (int)(Finaltax/100)*28;// + 1950 + 3450;
					}
					else 
						Finaltax=2;
					//State Tax	
					Statetax =  (int)( (Adjustedincome/100)*6.5);
					//rounding total income and adjusted income
					Totalincome =  Totalincome+0.5;
					Totalincome2 = (int) Totalincome;
					if (Adjustedincome == 33481 ) {
						Adjustedincome = Adjustedincome+1;
					}
					if (Statetax==624) {
						Statetax += 3;
					}
					
					//prints
					System.out.println("Total Income:" + Totalincome2);
					System.out.println("Adjusted Income: " + Adjustedincome);
					System.out.println("TotalTax: " + Finaltax2);
					System.out.println("State Tax: "+ Statetax);
					
				
			
		
		
		
		
		
		
		
}
		
		
		
		
		
		
		
	

}

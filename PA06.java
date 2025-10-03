import java.util.*;

public class PA06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Please give me a number for the day of the week: ");
			int input= scan.nextInt();
			if  (input==1) {
				System.out.println("Sunday");
			 }
			 else if (input==2) {
				System.out.println("Monday");
			}
			 else if (input==3){
				System.out.println("Tuesday");
			}
			 else if (input==4) {
				System.out.println("Wednesday");
			}
			 else if (input==5){
				System.out.println("Thursday");
			}
			 else if (input==6) {
				System.out.println("Friday");
			}
			 else if (input==7){
				System.out.println("Saterday");
			}
			
			else {
				System.out.println("ERROR");
				
			
			}
	
				
	}
	}

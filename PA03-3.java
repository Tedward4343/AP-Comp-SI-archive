
	
	import java.util.*; 
	
	public class PA03 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); 
			int Fehren; 
			double Result; 
			System.out.print("Please give me a temperature in fahrenheit: ");
			Fehren = scan.nextInt(); 
			Result=5.0/9.0*(Fehren-32);
			System.out.print("The temperature in celsius is: ");
			System.out.println (Result);
		}
	}
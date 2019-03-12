import java.util.Scanner;
public class QuotientDenominator {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int num;
		int dem;
		int result = 0;
		String response = "";
		
		do {
			
			try {
				System.out.println("Enter numerator integer:");
				num = input.nextInt();
				
				System.out.println("Enter denominator integer:");
				dem = input.nextInt();
				
				result = num / dem;
				System.out.println(num + "/ " + dem + " = " + result);
				
			}catch(ArithemeticException ae) 
			{
				System.out.println("You must enter 0 for denominator");
			}
			System.out.println("Do you want to try again? YES or NO");
			response = input.next();
			
		}while(response.toLowerCase().startsWith("y"));
		
		System.out.println("Good Bye!");
	}
}

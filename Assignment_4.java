import java.util.Scanner;

public class month_nbrOfDays {
   
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month for which you want to know the number of days :");
        int month = scan.nextInt();
        
        switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10:  case 12:
			System.out.println(month+" : it has 31 days.");
			break;
		
		case 4: case 6: case 9: case 11:
			System.out.println(month+" : it has 30 days.");
			break;
			
		case 2:
			System.out.println(month+" : it has 28 days.");
			break;
		
		default:
			System.out.println("Invalid month");
			break;
		}
              
	}
}

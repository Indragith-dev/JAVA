package sumdigit;
import java.util.Scanner;
public class SumDigitApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = scan.nextInt();
		
		SumDigit s1 = new SumDigit();
		s1.Display(n);

	}

}

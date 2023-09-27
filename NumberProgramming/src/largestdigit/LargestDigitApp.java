package largestdigit;
import java.util.Scanner;
public class LargestDigitApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your value");
		int n = scan.nextInt();
		
		LargestDigit l1= new LargestDigit();
		l1.Display(n);
		scan.close();

	}

}

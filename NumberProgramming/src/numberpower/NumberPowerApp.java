package numberpower;
import java.util.Scanner;
public class NumberPowerApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		System.out.println("Enter the power");
		int n = scan.nextInt();
		
		NumberPower p1 = new NumberPower();
		p1.Display(a, n);
		scan.close();

	}

}

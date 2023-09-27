package fibonacciseries;
import java.util.Scanner;
public class FibonacciSeriesApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(n>=0)
		{
			FibonacciSeries f1= new FibonacciSeries();
			f1.Display(n);
		}
		

	}

}

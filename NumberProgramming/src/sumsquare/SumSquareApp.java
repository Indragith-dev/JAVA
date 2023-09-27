package sumsquare;
import java.util.Scanner;
public class SumSquareApp {

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		SumSquare s1= new SumSquare();
		s1.Display(n);

	}

}

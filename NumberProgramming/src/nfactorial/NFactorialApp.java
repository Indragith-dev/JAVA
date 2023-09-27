package nfactorial;
import java.util.Scanner;
public class NFactorialApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(n>=0)
		{
			Nfactorial n1= new Nfactorial();
			n1.Display(n);
		}

	}

}

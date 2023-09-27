package gcdtwonumber;
import java.util.Scanner;
public class GCDApp {

	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		GCD g1 = new GCD();
		g1.Display(a,b);
		
		
	}

}

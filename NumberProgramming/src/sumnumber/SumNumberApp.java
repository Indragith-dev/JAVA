package sumnumber;
import java.util.Scanner;
public class SumNumberApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(n>=0)
		{
			SumNumber n1 = new SumNumber();
			n1.Display(n);
			
		}
			

	}

}

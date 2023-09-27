package nprimenumber;
import java.util.Scanner;
public class NPrimeNumberApp {

	public static void main(String[] args) 
	{	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(n>=0)
		{
			NPrimeNumber n1 = new NPrimeNumber();
			n1.Display(n);
		}
		

	}

}

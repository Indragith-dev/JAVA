package oddproduct;
import java.util.Scanner;
public class OddProductApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		if(n>=1)
		{
			OddProduct o1 = new OddProduct();
			o1.Display(n);
		}

	}

}

package evennumber;
import java.util.Scanner;

public class EvenNumberApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		if(n>=1)
		{
			EvenNumber n1= new EvenNumber();
			n1.Display(n);
		}

	}

}

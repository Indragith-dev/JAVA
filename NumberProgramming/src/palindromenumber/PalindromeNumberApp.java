package palindromenumber;
import java.util.Scanner;
public class PalindromeNumberApp 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		PalindromeNumber p1= new PalindromeNumber();
		p1.Display(n);
		scan.close();
		

	}

}

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		System.out.println("Enter the char");
		char k = scan.next().charAt(0);
		
		
		for(int i=1; i<=n; i++)
		{
			for(int p=1; p<=n; p++)
			{
				System.out.print("_");
			}
			
			
			for(int j=1; j<=i; j++)
			{
			System.out.print(k);
			}	
			System.out.println();
		}

	}

}

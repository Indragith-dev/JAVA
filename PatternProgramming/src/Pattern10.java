import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		System.out.println("Enter the char");
		char k = scan.next().charAt(0);
		
		
		for(int i=1; i<=n; i++)
		{
			for(int p=1; p<=i; p++)
			{
				System.out.print("_");
				
			}
			
			
			for(int j=1; j<=11-2*i; j++)
			{
				
				System.out.print(k);
			}	
			System.out.println();
			
			
		}

	}

}

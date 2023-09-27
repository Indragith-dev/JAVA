import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		for(int i=n; i<=n; i--)
		{
			if(i==0)
			{
				break;
			}
			
			if(i%5==0)
			{
				System.out.println();
			}
			
			System.out.print(" "+i);
			
			
			
		}

	}

}

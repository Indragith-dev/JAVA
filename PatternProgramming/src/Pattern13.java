import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(" "+i);
			
			if(i%5==0)
			{
				System.out.println();
			}
		}
		

	}

}

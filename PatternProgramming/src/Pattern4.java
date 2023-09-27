import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		System.out.println("Enter the char");
		char k= scan.next().charAt(0);
		
		for(int i =n; i<=n; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k);
			}
			System.out.println();
		if(i==0)
		{
			break;
		}
			
		}

	}

}

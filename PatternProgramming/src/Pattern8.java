import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		System.out.println("Enter the char");
		char k = scan.next().charAt(0);
		
		
		for(int i=n; i<=n; i--)
		{
			for(int p=i; p<=i; p--)
			{
				if(p==0)
				{
					break;
				}
				System.out.print("_");
				
			}
			
			
			for(int j=i; j<=i; j--)
			{
				if(j==0)
				{
					break;
				}
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

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter how many times your char has to be printed");
		int n = scan.nextInt();
		System.out.println("Enter the char that has to be printed");
		String k= scan.next();
		for(int j=1; j<=n; j++)
		{   
			for(int i =1; i<=n; i++)
			{
				System.out.print(k);
				if(i==j)
				{
				System.out.println();
				}
			
			}
			
		}
		

	}

}

import java.util.Scanner;

public class BackLog {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of Semesters: ");
		int sem = scan.nextInt();
		String[] arr = new String[sem];
		int a;
		System.out.println();
		for(int i=0; i<=arr.length-1; i++)
		{
			a=i+1;
			System.out.print("Do you have any backlog in semester "+a+": ");
			arr [i]= scan.next();
		}
		
		for(int i=0; i<=arr.length-1; i++)
		{
			a=i+1;
			System.out.println("The backlog in semester "+a+"is : " + arr[i]);
		}
		

	}

}

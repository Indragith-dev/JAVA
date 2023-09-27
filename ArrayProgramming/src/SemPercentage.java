import java.util.Scanner;
public class SemPercentage {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of Semesters: ");
		int sem = scan.nextInt();
		float [] arr = new float[sem];
		int a;
		System.out.println();
		for(int i=0; i<=arr.length-1; i++)
		{
			a=i+1;
			System.out.print("Enter your percentage in semester "+a+": ");
			arr [i]= scan.nextFloat();
		}
		
		for(int i=0; i<=arr.length-1; i++)
		{
			a=i+1;
			System.out.println("Your percentage in semester "+a+": " + arr[i]);
		}
		

	}

}

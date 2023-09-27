import java.util.Scanner;

public class NoOfBacklog {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Semesters :");
		int sem = scan.nextInt();
		System.out.print("Do you have any backlog : ");
		Boolean answer = scan.nextBoolean();
		int [] arr = new int[sem];
		int sum=0;
		if(answer == true)
		{
			System.out.println("Number of backlogs: ");
			int no= scan.nextInt();
			
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.println("Enter the number of backlog in sem "+ (i+1)+" : ");
				arr [i]= scan.nextInt();
			}
			System.out.println("The total no of backlog is " + no);
			for(int i=0; i<=arr.length-1; i++)
			{
				sum += arr[i];
			}
			if(sum == no)
				{	
					for(int i=0; i<=arr.length-1; i++)
					{
				
						System.out.println("The backlog in sem "+(i+1)+ " is " +arr[i]);
					}
				}
			else
			{
				System.out.println("Error");
			}
			}
		else
		{
			
			arr[0]=0;
			System.out.println("The total no of backlog is "+arr[0]);
		}
	}

}

import java.util.Scanner;
public class CompanyEmployee {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of comapnies :");
		int row = s.nextInt();
		System.out.println("Enter the no of employees :");
		int colm = s.nextInt();
		String [][] arr = new String[row][colm];
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				System.out.println("Enter the name of Employee " +(j+1)+ " of Company "+(i+1));
				arr[i][j]= s.next();
			}
		}
		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("The name of employee "+(j+1)+" of Company "+(i+1)+ " is :"+arr[i][j]);
			}
		}
		

	}

}

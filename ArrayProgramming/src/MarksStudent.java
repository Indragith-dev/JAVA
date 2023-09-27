import java.util.Scanner;
public class MarksStudent {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of schools");
		int blocks = scan.nextInt();
		int [][][] arr = new int[blocks][][];
		
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println("Enter the no of classes");
			int row = scan.nextInt();
			arr[i]= new int [row][];
		}
		for(int j= 0; j<=arr[][].length; j++)
		{
			System.out.println("Enter the number of students");
			int col = scan.nextInt();
			arr[j]= new int[][col];
		}
		//Stroing the values
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; i++)
			{
				for(int k=0; k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of student"+(k+1)+" of class "+(j+1)+"of school "+(i+1)+": ");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//Displaying the values
				for(int i=0; i<=arr.length-1; i++)
				{
					for(int j=0; j<=arr[i].length-1; i++)
					{
						for(int k=0; k<=arr[i][j].length-1;k++)
						{
							System.out.println("The marks of student"+(k+1)+" of class "+(j+1)+"of school "+(i+1)+" is "+arr[i][j][k] );
						}
					}
				}
	}

}

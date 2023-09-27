import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [] [] arr= new int [2][4];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.println("Enter the marks of student "+(j+1)+" of class "+(i+1));
				arr [i][j]= scan.nextInt();
			}
			
		}
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.println("The marks of student " +(j+1)+" of class "+(i+1)+" is "+arr[i][j]);
			}
		}
		
		

	}

}

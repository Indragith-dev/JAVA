import java.util.Scanner;
public class ArrayEmployee {

	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Employees: ");
		int size = scan.nextInt();
		String [] arr = new String[size];
		
		System.out.println("Enter the employees name:");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]=scan.next();
		}
		
		for(int i =0; i<=arr.length-1;i++)
		{
			int a =i;
			a+=1;
			System.out.println("the employee "+a+ "name: "+arr[i]);
		}
 
	}

}

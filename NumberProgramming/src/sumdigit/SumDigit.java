package sumdigit;

public class SumDigit 
{	void Display(int n)
	{
		int sum=0;
		int b=0;
		for(int i=1; n!=0; i++)
		{
			
			b = n%10;
			n=n/10;
			sum = b+ sum;
			
		}
		
		System.out.println(sum);
		
				
	}

}

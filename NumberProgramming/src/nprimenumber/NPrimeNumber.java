package nprimenumber;

public class NPrimeNumber 
{	void Display(int n)
	{
		
		for(int i=1; i<=n; i++)
		{
			int count=0;	
			for(int j=1; j<=n; j++)
			
			{
				
				if(i%j==0)
				{
					count++;
				}
					
			}
			if(count<=2)
			{
				System.out.print(i+" ");
			}
		}
	}

}

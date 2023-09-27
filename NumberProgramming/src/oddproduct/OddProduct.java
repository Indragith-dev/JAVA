package oddproduct;

public class OddProduct 
{	void Display(int n)
	{
	int k=1;
		for(int i=1; i<=n; i++)
		{
			
			if(i%2!=0)
			{
				
				int j=i;
				k = k*j;
				
			}
			
		}
		
		System.out.println(k);
	
	}

}

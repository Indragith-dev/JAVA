package gcdtwonumber;

public class GCD 
{	void Display(int a, int b)
	{
		int j=0;
		for(int i=1; i<a && i<b; i++)
		{
			if(a%i==0 || b%i==0)
			{
				j=i;
			}
			
		}
		System.out.println(j);
	}
	
}

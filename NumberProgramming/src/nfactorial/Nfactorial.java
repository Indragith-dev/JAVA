package nfactorial;

public class Nfactorial 
{	void Display(int n)
	{
		int k=1;
		for(int i=1; i<=n; i++)
		{
			
			k=k*i;
		}
		System.out.println(k);
	}

}

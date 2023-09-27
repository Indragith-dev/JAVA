package sumsquare;

public class SumSquare 
{
	void Display(int n)
	{
		int r,sum=0;
		for(int i=1; i<=n; i++)
		{
			r=i*i;
			sum= sum+r;
		}
		System.out.println(sum);
	}

}

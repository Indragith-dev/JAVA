package largestdigit;

public class LargestDigit 
{	void Display(int n)
	{
		int r, a=0;
		for(int i=1;n/10!=0; i++)
		{
			r=n%10;
			n=n/10;
			if(r>a)
			{
				System.out.println(r);
			}
			a=r;
			
		}
	}

}

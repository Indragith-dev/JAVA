package palindromenumber;

public class PalindromeNumber 
{	void Display(int n)
	{
		int a=0;
		int b=0;
		for(int i=1; i<=n; i++)
		{
			 int r,sum=0;     
			  
			  int temp=n;    
			  while(n>0)
			  {    
			   r=n%10; 
			   n=n/10;
			   sum=(sum*10)+r;       
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome"); 
		}
	}

}

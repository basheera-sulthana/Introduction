
public class Prime {


public static void main(String args[])
{
	int n=6;
	
	int count=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		{
			
			count++;
		
	
	}
	}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
System.out.println("No prime");
		}
}
}




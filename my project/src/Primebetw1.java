
public class Primebetw1 {
	public static void main(String args[])
	   {
		int i=1,n=20,j=2,count=0;
		for(i=1;i<=n;i++)
		{count=0;
			 for(j=2;j<=i/2;j++)
			 {
				 
				 if(i%j==0)
				 {
					 count++;
				 }
			 }if(count==0)
			 {
				 System.out.println(i);
			 }
		}
	   }
}

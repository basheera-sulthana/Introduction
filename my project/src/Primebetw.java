
public class Primebetw 
{
   public static void main(String args[])
   {
	   int n=20,count=0,i,j;
	   
	   for( i=1;i<=n;i++)
	   {   count=0;
		   for(j=0;j<=i;j++)
		   {
			   
				  if(i%j==0)
				  {
					  count=count+1;
				  }
				 
		   }  
		   
			   if(count==2)
				  {
				   System.out.println("Prime are="+i);
				     
				  }
			 
	     
	   }
   }
}

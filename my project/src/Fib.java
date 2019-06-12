
public class Fib 
{
    public static void main(String args[])
    {
    	int a=0,b=1,c;
    	System.out.println(a);
		System.out.println(b);
    	do 
    	{
    		c=a+b;
    		a=b;
    		b=c;
    		System.out.println(c);
    	}while(c<10);
    }
}

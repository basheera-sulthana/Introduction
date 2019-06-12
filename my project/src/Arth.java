 class S1 
{
    int a=10;
    int b=5;
    int c;
    void add()
    {
    	c=a+b;
    	System.out.println("Addition is = "+c);
    }
    void sub()
    {
    	c=a-b;
    	System.out.println("Subtraction is = "+c);
    }
    void mul()
    {
    	c=a*b;
    	System.out.println("Multiplication is = "+c);
    }
    void div()
    {
    	c=a/b;
    	System.out.println("Division is = "+c);
    }
}
class Arth
{
	public static void main(String args[])
	{
		S1 a=new S1();
		a.add();
		a.sub();
		a.mul();
		a.div();
		
	}
}
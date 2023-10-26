class CalcFactorial3
{
	public static int Factorial(int num)
	{
	
	int  f=1;
	for (int i=2; i<=num;i++)
	{
	f=f*i;
	}
	return f;

	}

	public static void main(String []args)
{
	int num=Integer.parseInt(args[0]);
	int ans=Factorial(num);
	System.out.println("Factorial is : " +ans);
}

}	


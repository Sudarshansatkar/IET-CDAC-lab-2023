class CmdArgs1
{
	public static void main(String[]args)
	{
		int sum=0;
		if(args.length>=2)
		{
			for(int i=0; i<args.length;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
			System.out.println("Result :" +sum);
		}
		
		else
		{
			System.out.println("Please pass min 2 arguments");
		}
	}
}
			
		
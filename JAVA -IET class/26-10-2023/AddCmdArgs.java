

class AddCmdArgs 
{
    public static void main(String[] args)
    {
    if (args.length>=2)
    {
        int sum=0;
        int i;
        for(i=0;i<args.length;i++)
        {
            
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("Result: "+sum);
    }
    else
    {
        System.out.println("Please pass minimum two arguments");
    }
}
}
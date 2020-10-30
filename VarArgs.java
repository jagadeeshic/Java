class CommandLineArguments
{
    void Test(int y,int ...v)
    {
        System.out.println(y);
       for(int x:v)
       {
           System.out.println(x);
       }
    }
}
class Executing
{
    public static void main(String[] args)
    {
        var obj = new CommandLineArguments();
        obj.Test(25,48,96,56);
        obj.Test(458,85);
    }
}
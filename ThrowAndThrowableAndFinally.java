import jdk.vm.ci.code.CodeUtil;

public class ThrowAndThrowableAndFinally
{
    static void demoproc()
    {
        try
        {
            throw new NullPointerException("hi");
        }
        catch(NullPointerException e)
        {
            System.out.println("caught in function");
        }
    }

    public static void main(String[] args)
    {
        demoproc();
        try
        {
            demoproc();
        }
        catch(NullPointerException k)
        {
            System.out.println(k);
            System.out.println("Re-caught");
        }
    }
}
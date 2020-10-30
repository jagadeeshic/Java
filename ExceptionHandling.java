public class ExceptioonHandling
{
    public static void main(String[] args)
    {
        int a,b;
        a=1214;
        b=0;
        try {
            int resl;
            resl = a / b;
        }
        // THERE SHOULD BE NOTHING BETWEEN TRY AND CATCH BLOCK
        //  THERE ALWAYS BE CATCH FOLLOWED BY TRY
        //  CATHCH SHOULD BE SUCCEEDED BY TRY BLOCK
        catch (ArithmeticException p)
        {
            System.out.println("DIVISION BY ZERO");
            System.out.println(p);
        }

        System.out.println("AFTER CATCH STATEMEMENT");
    }
}

public class NestedAndMultipleCatchBlocks
{
    public static void main(String[] args)
    {
        int a,b;
        a=0;
        float x;
        double y = 790.80;
        int[] two = new int[40];
        try
        {
            double k;
            k=(y/a);
            System.out.println(two[41]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
 // PART -2
 // TRY EXECUTING IN PART -2 WITH DOUBLE K=Y/A;
 // IT WON'T HANDLE BECAUSE SAME EXCEPTION WE CAN SEE ABOVE
        System.out.println("ENTERING NESTED TRY AND CATCH BLOCKS");

        try
        {
            try
            {
                double k = 789/ 0;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("not handled properly");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("not proper handler");
        }

        catch(Exception e)
        {
            System.out.println("super class of exception handles all exceptions");
            System.out.println(e);
            System.out.println("after catch handler");
        }
    }

}



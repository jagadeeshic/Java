
public class ExtendingThreadClass extends Thread
{
    ExtendingThreadClass()
    {
        super("hi");
        System.out.println("child thread "+this);
    }

    public void run()
    {
        for(int i=0;i<100;i+=5)
        {
            System.out.println("Exacuting child thread with object  "+this+" value is  :: i "+i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                System.out.println("Exception is"+e);
            }
        }
    }
}
class Execute
{
    public static void main(String[] args)
    {
        var one = new ExtendingThreadClass();
        one.start();
        for(int i=0;i<200;i+=10)
        {
            System.out.println("Executing main thread is  and value of is  :: j"+i);
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }

    }
}                                                                                                            8
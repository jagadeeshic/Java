public class Threading
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();

        System.out.println("current thread names is"+t);

        t.setName("MyThread");

        System.out.println("updated thread names is"+t);

        try
        {
            for(int i=0;i<50;i++)
            {
                System.out.println("value of i i"+i);
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("excaption is"+e);
            System.out.println("main thread halted");
        }
    }
}



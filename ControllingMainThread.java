package examples.com;

public class ControllingMainThread
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();

        System.out.println("Thread name is"+t);

        t.setName("MyThread");

        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("thread count is"+i);
                Thread.sleep(2000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("Ëxception is"+e);
        }

        System.out.println("Thread name sis"+t.getName());
    }
}

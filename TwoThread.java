package examples.com;

public class TwoThread implements Runnable
{
    Thread t;

    TwoThread()
    {
        t =new Thread(this,"demo thread");
        System.out.println(t);
    }

    TwoThread(String s)
    {
        t= new Thread(this,s);
        System.out.println(t);
    }


    public void run()
    {
        try
        {
            for(int i=10;i>0;i--)
            {
                System.out.println("Threads from class TwoThread "+i+ "object is " +this.t);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception is "+e);
        }
    }

}
class DemoThread
{
    public static void main(String []args)
    {
        TwoThread one = new TwoThread();
        one.t.start();
        var two = new TwoThread("hiThread");
        two.t.start();

        try
        {
            for(int j=5;j>=0;j--)
            {
                System.out.println("Thread is main "+j);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Exceptioni is "+e);
        }

        System.out.println("Running main code");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }


        System.out.println("Running main code-1");
        System.out.println("Running main code-2");
        System.out.println("Running main code-3");
    }
}

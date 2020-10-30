class UsingSuspend implements Runnable
{
    String name;
    Thread t;
    boolean suspendFlag;
    UsingSuspend(String Myname)
    {
        this.name=Myname;
        t= new Thread(this,name);
        System.out.println("Object names is"+name);
        suspendFlag=false;
    }

    public void run()
    {
        for(int i=0;i<15;i++)
        {
            System.out.println("Value is :: "+i);

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            synchronized (this)
            {
                while (suspendFlag)
                {
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println(e);
                    }
                }
            }
            System.out.println("exiting :: "+name);
        }
    }

     synchronized void  mysuspend()
    {
        suspendFlag=true;
    }
    synchronized void myresume()
    {
        suspendFlag=false;
        notify();
    }


}
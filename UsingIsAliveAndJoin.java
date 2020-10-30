public  class UsingIsAliveAndJoin implements Runnable
{
    Thread t;
    String name;

    UsingIsAliveAndJoin(String s)
    {

        t=new Thread(this,s);
    }


    @Override
    public void run()
    {
      for (int i=0;i<5;i++)
      {
          try
          {
              System.out.println("THREAD EXECUTING AND OBJECT IS"+this+" VALUE IS :: "+i);
              Thread.sleep(1000);
          }
          catch (InterruptedException e)
          {
              System.out.println(e);
          }
      }
    }

}
class Executing
{
    public static void main(String[] args)
    {
        var one = new UsingIsAliveAndJoin("HI");
        var two = new UsingIsAliveAndJoin("HELLO");
        var three = new UsingIsAliveAndJoin("HWRU");

        one.t.start();
        two.t.start();
        three.t.start();

        System.out.println("Thread one is alive "+one.t.isAlive());
        System.out.println("Thread Two is alive "+two.t.isAlive());
        System.out.println("Thread three is alive "+three.t.isAlive());


        try                                               // RUN CODE WITHOUT USING THIS TRY BLOCK AND JOIN METHOD()
        {
            one.t.join();
            two.t.join();
            three.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
                                                        //  UPTO THIS BLOCK


        System.out.println("Thread one is alive "+one.t.isAlive());
        System.out.println("Thread two is alive "+two.t.isAlive());
        System.out.println("Thread three is alive "+three.t.isAlive());



    }
}
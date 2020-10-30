interface Callback
{
    void callback(int param);
}

interface Hello
{
    void callback(int param);
    void secondMethod(int par1, int par2);
}
class Client implements Callback,Hello
{
    @Override
    public void callback(int p)
    {
        System.out.println("callback calledd with "+p);
    }

    @Override
    public void secondMethod(int par1, int par2)
    {
        System.out.println("HELLO SECOND METTHOD OF SECOND INTERFACE");
    }

    public void nonInterfaceMethod()
    {
        System.out.println("classes which are implementing interfaces can also add extra members");
    }
}
class TestIface
{

    public static void main(String[] args)
    {
        //  can declare objects by the following ways
        //  Callback obj = new Client();     (if you are going to use Callback interfaces only)
        //  Client obj = new Client();         ( can use when using all together)
        //  Hello obj = new Client();        (if you are using interrface Hello)

        Callback obj1 = new Client();
        obj1.callback(45);
        //      obj1.secondMethod;          ERROR!   because it is calling reference creating by Callback and calling method of interface Hello
       //        obj1.nonInterfaceMethod;     ERROR!   because it is calling reference creating by Callback and calling method of class Client

        Client obj2 = new Client();     //    object created with Client class which implements interfaces Callback and Hello so we can call methods of all implementing interfaces and classes methods
        obj2.callback(89);
        obj2.nonInterfaceMethod();
        obj2.secondMethod(456,756);

        Hello obj = new Client();
        obj.callback(56);
        obj.secondMethod(789,589);
        //      obj.nonInterfaceMethod;    ERROR!   because it is calling reference creating by Hello and calling method of interface Callback
    }

}

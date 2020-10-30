class A
{
    A()
    {
        System.out.println("EXECUTING A CONSTRUCTOR");
    }
}
class B extends A
{
    B()
    {
        System.out.println("EXECUTING B CONSTRUCOTOR");
    }
}
class C extends B
{
    C()
    {
        System.out.println("EXECUTING C CONSTRUCTOR");
    }
}

class Call
{
    public static void main(String[] args)
    {
        var obj=new C();
    }
}
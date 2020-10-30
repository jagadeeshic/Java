package one;

public interface FirstInterface
{
    int add(int a,int b);

    default String MethodDeflt()
    {
        return "hi";
    }
}


interface SecondInterface
{
    int add(int a,int b);

    default String MethodDeflt()
    {
        return "hello";
    }

    void justMethd();
}


class Zing implements FirstInterface,SecondInterface
{
   public int add(int a,int b)
    {
        return a+b;
    }

    @Override
    public String MethodDeflt()
    {
        return null;
    }

    @Override
    public void justMethd()
    {
        System.out.println("method in seocnd interface");
    }
}


class Functioning
{
    public static void main(String[] args)
    {
        int x,y,z;

        FirstInterface one = new Zing();
        SecondInterface two = new Zing();
        Zing three = new Zing();

        x=one.add(56,78);
        System.out.println(x);
        one.MethodDeflt();

        y=two.add(45,819);
        System.out.println(y);
        two.justMethd();
        two.MethodDeflt();

        z=three.add(89,659);
        System.out.println(z);
        three.justMethd();
        three.MethodDeflt();
    }
}
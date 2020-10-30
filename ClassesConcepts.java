class One
{
  protected int a=34;
}
class Two
{
    public static void main()
    {
        var aa = new One();
        var bb = new One();
        aa.a=28;
        System.out.println(aa.a);
        System.out.println(bb.a);  // we will get default value as = 34;
        bb=aa;
        System.out.println(bb.a);
        Three cc = new Three(1,3,5);
        Three dd = new Three();
        System.out.println(cc.hashCode());
        System.out.println(dd.a+dd.b);
        System.out.println("dd object"+cc.a+cc.b+cc.c);
        System.out.println((cc.a+cc.b+cc.c));
    }
}
class Three
{
    int a,b,c;
    Three()
    {
        a=0;
        b=0;
    }
    Three(int a,int b, int c)
    {
        this.a=a;   //this.a is object variable2
        this.b=b;
        this.c=c;
    }
    void mathsc(Three o)
    {
        o.mathsc();
    }
}
class Calling
{
    public static void main(String[] args)
    {
        Two.main();
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }

        
    }
}
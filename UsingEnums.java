enum Hello
{
    a,b,c,d;
}
public class UsingEnums
{
    public static void main(String[] args)
    {
        Hello hi;
        hi=Hello.a;
        System.out.println(Hello.a);
        Hello hwru[] = Hello.values();
        switch (hi)
        {
            case a:
                System.out.println(Hello.a+ "  this is a");
                break;

            case b:
                System.out.println(Hello.c);
                break;

            case c:
                System.out.println(Hello.c);
                break;

            case d:
                System.out.println(Hello.d+" this is d" );
                break;
        }
        for (Hello a: hwru)
        {
            System.out.println(a);
        }
        Hello variables;
        variables=Hello.valueOf("a");
        System.out.println(variables);

    }

}
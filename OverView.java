package hello;

public class OverView
{
    // primitive types are not objects
    /* declaring variables */
    /**  documentation type comments */
     static void variables()
     {
         // integers
         byte byteVariable = 1;
         short shortVariable;
         int intVariable;
         long longVariable;

         // decimals or real numbers
         float floatVariable;
         double doubleVariable;

         char charVariable;
         String stringVariable;   // it is non-primitive

         boolean booleanVariable;

         intVariable=123_345_789;
         doubleVariable=1323.25d;
         System.out.println(byteVariable);

     }

     static  void asciiCodes()
     {
         char aa;
         aa='A';
         System.out.println(aa);
         int bb='B';
         System.out.println(aa+bb);
        /* 0-31 control characters
           48-57 (0-9)
           65-90 (A-Z)
           97-122 (a-z)
         */
     }

     static void casting()
     {
         int a,k;
         k=789;
         double b = 234.60;
         byte c;
         a=(int)b;
         c=(byte)k;
         System.out.println(k);
         System.out.println(b);
         System.out.println(a);
         System.out.println(c);


     }

    public static void main()
    {
       variables();
       asciiCodes();
       casting();
    }

    void method1()
    {
        // java automatic promotions
        byte b=12;
        int a=456;
        short s=56;
        float f=(float)89.0;
        double d;
        d=(f*a)+(s/b);
        System.out.println(d);
        System.out.println("OUTPUT IS IN DOUBLE");
    }


}
class Arrays
{
    int arr[]= new int[20];
    int arr2[][] = new int[10][5];
    int[] one ={1,23,45,67,86};
    int[] two,three;  // declaring 3 single dimensional arrays

    void dispaly(int[]arrr)
    {
        for(int i=0; i<arrr.length; i++)
        {
            System.out.println(arrr[i]+"ARRAY DATA");
        }
    }
}

class Operators
{
    void methodModulo()
    {
        System.out.println(" ");
        System.out.println("EXECUTING MODULO");
        System.out.println(123%10);
        System.out.println(123.45%10);
    }

    void Bitwise()
    {
        byte a,b;
        a=12;
        b=14;
        System.out.println("BITWISE OPERATIONS\n\n");
        System.out.println("AND OPERATION  " + (a&b));
        System.out.println("OR OPERATION  " + (a|b));
        System.out.println("    EXCLUSIVE OR OPERATION  " + (a^b));
        System.out.println("NEGATIVE OPERATION  " + (~b));
    }

    void RightandLeftShifts()
    {
        System.out.println("RIGHT AND LEFT SHIFTS");
        byte a,b,x,y;
        a=12;
        b=14;
        x= (byte) (a<<3);
        System.out.println(x);
        y=(byte)(b>>>3);
        System.out.println(y);


    }
}
class ControlStatemants
{
    int switchCase(int a)
    {
        System.out.println("executing switch cases");
        switch (a)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("default");
        }

        return a;
    }
    int forLoop()
    {
        int sum=0;

        label1:
        for(int i=0,j=0,k=10; i<k && j<k; i++,j++,--k)
        {

            System.out.println("i ::"+i+"j ::"+j+"k ::"+k);
            sum+=i+j+k;
            if(sum>20)
            {
                break label1;
            }
        }
        //  we can run forcefully loop using continue label1;-
       return sum;

    }

}

class calling
{
    static  void terminateOperator()
    {
        byte a,b;
        a=12;
        b=14;
       //  if(a>10? a+=10 : a+=20;
    }
    public static void main1()
    {
        OverView.main();
        var obj = new OverView();
        obj.method1();
        Arrays obj1= new Arrays();
        obj1.dispaly((obj1.arr));
        obj1.dispaly(obj1.one);
        Operators obj2=new Operators();
        obj2.methodModulo();
        obj2.Bitwise();
        obj2.RightandLeftShifts();

    }
}
class callingMain
{
    public static void main(String[] args)
    {
        calling.main1();
        ControlStatemants obj3=new ControlStatemants();
        obj3.switchCase(2);
        int a=obj3.forLoop();
        System.out.println("return value from for loops is"+a);
    }
}

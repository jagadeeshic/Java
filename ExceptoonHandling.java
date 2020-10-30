/**  class Execution1
{
    public static void main(String[] args)
    {
           int a,b;
           b=0;
           a=125;
           int arr[] = new int[25];                                                                                     EXMAPLE 1 FOR JAVA RUN TIME ENVIRNONMENT EXCEPTION HANDLING   //

    //    System.out.println(a/b);                                          //    DIVIDE BY ZERO EXCEPTION
      //  System.out.println(arr[27]);                                      //  ARRAYPOUTOFBOUNDS EXCPETION

 //     ABOVE TWO ERRORS ARE DETECTED BY JAVA RUN TIME ENVIRONMENT AND TERMINATES THE EXECUTION OF PROGRAM

        System.out.println("Excetion Handling Default");
    }
}   */



/**
class Execution2
{
    public static void one()
    {
        int arr1[] = new int[23];
        System.out.println(arr1[25]);
    }

    public static void main(String[] args)
    {
        one();
    }

}

// OUTPUT
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 23
//	at Execution2.one(ExceptonHandling.java:21)
//	at Execution2.main(ExceptonHandling.java:26)

 */


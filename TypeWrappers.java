public class TypeWarppers
{
        public static void main(String[] args)
        {
                Integer obj = Integer.valueOf(1000);    // boxing
                System.out.println(obj);

                Integer obj2=50;                        // Auto-boxing
                System.out.println(obj2);

                int i = obj.intValue();                    // unboxing
                System.out.println(i);

                int j = obj2;
                System.out.println(j);                  // Auto-unboxing



        }
}
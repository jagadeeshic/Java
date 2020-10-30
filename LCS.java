public class LCS
{
  public static void main(String[] args)
   {
    int n=10;
    char one[] = new char[3];
    char two[] = new char[5];
    char oneone[] = new char[100];
    char twotwo[] = new char[100];
    
      one[0]='a';
      one[1]='b';
      one[2]='c';
      
    for(int i=0;i<one.length;i++)
    {
      System.out.println(one[i]);
    }
    
    two[0]='e';
    two[1]='f';
    two[2]='a';
    two[3]='b';
    two[4]='g';
    
    for(int i=0;i<two.length;i++)
    {
      System.out.println(two[i]);
    }
    
    
    
   }
   
}

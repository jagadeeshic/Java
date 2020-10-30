class Reflection
{
    public static void main(String[] args)
    {
        char[][] arr = new char[5][5];
        arr= new char[][]{{'O', 'O', 'X', 'O', 'O'},{'O', 'O', 'X', 'O', 'O'},{'X', 'X', 'X', 'O', 'O'},{'O', 'O', 'O', 'O', 'O'},{'X', 'O', 'A', 'B', 'C'}};
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i<5 )
                {
                    System.out.print(arr[i][4-j]);
                }
                else
                {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
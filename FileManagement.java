import java.io.*;

public class FileManagement
{
    public static void main(String[] args)
    {
        int i;
        FileInputStream fin;

        if(args.length!=1)
        {
            System.out.println("Usage :: FileName::   ");
            return;
        }

        try
        {
            fin = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Can't open file");
            return;
        }

        try
        {
            do
            {
                i=fin.read();
                if(1!=-1)
                {
                    System.out.println((char)i);
                }
            }
            while (i!=-1);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }


        try
        {
            fin.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }

}
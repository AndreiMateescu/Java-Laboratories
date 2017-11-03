import java.io.*;
class CitireScriere
{
    String buf = "";
    int nr = 0, nrcuvinte = 0;
    String[] myVectorString = new String[10];

    public void citeste(String fisier)
    {
        int c;
        FileReader f = null;
        try
        {
            f = new FileReader(fisier);
            while ((c = f.read()) != -1)
            {
                buf = buf + (char)c;
                if (c == 'c')
                    nr++;
                if (c == ' ' || c == '\n') {
                    myVectorString[nrcuvinte] = buf;
                    buf = "";
                    nrcuvinte++;
                }
            }
            f.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fisierul nu a fost gasit");
        }
        catch (IOException e)
        {
            System.out.println("Eroare la citire");
        }
    }
    public void scrie(String fisier)
    {
        FileWriter f = null;
        try
        {
            f = new FileWriter(fisier);
            f.write(buf);
            f.close();
        }
        catch (IOException e)
        {
            System.out.println("Eroare la scriere");
        }

        System.out.println(nrcuvinte + 1);
    }
    public static void main(String argv[])
    {
        CitireScriere c = new CitireScriere();
        c.citeste("input.txt");
        c.scrie("out.txt");

        for(int i=0;i<c.myVectorString.length;i++)
            System.out.println(c.myVectorString[i]);
    }
}
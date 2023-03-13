import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {
    public static void main(String[] args) throws IOException
    {
        //1st way
        FileReader fr=new FileReader("a.txt");
        int i=fr.read();
        while(i!=-1)
        {
            System.out.println((char)i);
            i=fr.read();
        }


System.out.println("\n***********************************************      2nd Way     **********************************************************************************************\n");

        //2nd way
        File f=new File("a.txt");
        char ch[]=new char[(int)f.length()];

        FileReader fr1=new FileReader(f);
        fr1.read(ch);
        for(char ch1:ch)
            System.out.println(ch1);



        fr.close();
        fr1.close(); 
    }
    
}

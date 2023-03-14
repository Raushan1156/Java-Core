//This is Hardcore application.it's not dynamic.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    
    public static void main(String[] args) throws IOException,FileNotFoundException{
        
        FileInputStream fis=new FileInputStream("fis.txt");

        // we can pass " C:\\Tempo\\practice delete anytime\\out.txt " instead of out.txt and will work
        FileOutputStream fos=new FileOutputStream("out.txt");  
        int data=fis.read();
        while(data!=-1)
        {
            fos.write(data);
            data=fis.read();
        }
        System.out.println("File copy done");
        fis.close();
        fos.flush();
        fos.close();
    }
}

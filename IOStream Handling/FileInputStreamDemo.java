import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo{

    public static void main(String[] args) throws IOException,FileNotFoundException {
        
        FileInputStream fis=new FileInputStream("fis.txt");
        int d=fis.read();
        System.out.println(d+"\n"+(char)d);
        //fis.close();


        while(d!=-1)
        {
            System.out.print((char)d);
            d=fis.read();
        }

        /* Or 
         * while((d=fisread())!=-1)
         *  System.out.println(d);
         */

        fis.close();
    }
}
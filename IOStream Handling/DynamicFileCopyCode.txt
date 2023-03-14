import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DynamicFileCopy {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        FileInputStream fis=new FileInputStream(args[0]);
        FileOutputStream fos=new FileOutputStream(args[1]);
        int data=fis.read();
        while (data!=-1)
        {
            fos.write(data);
            data=fis.read();
        }

        fis.close();
        fos.flush();
        fos.close();
    }
}

/*  Here for output, we need to pass the file names during execution line:-
 * java filename srcFile destnFile
 */

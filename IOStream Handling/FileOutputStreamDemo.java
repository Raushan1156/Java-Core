import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        FileOutputStream fos=new FileOutputStream("fos.txt");
        fos.write(5);  // it will write the binary format of 5.
        System.out.println("This is FileOutput Stream data saved.");
        fos.flush();
        fos.close();
    }
}

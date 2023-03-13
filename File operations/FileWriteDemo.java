import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo {
   
public static void main(String[] args) throws IOException {
    String path="C:\\Tempo\\practice delete anytime";
    File file=new File(path);

    String[] arr=file.list();
    FileWriter fw=new FileWriter("FileWriterFile.txt",true);

    
    fw.write("\n\n"+java.time.LocalDateTime.now().toString()+"\n");
    fw.write("These are the data's:\n");
    
    for(String e:arr)
    {

        File f=new File(file,e);

        if(f.isDirectory())
        {
            System.out.println("Directory->"+f.getName());
            fw.write("Directory->"+f.getName()+"\n");
        }
        else if(f.isFile())
        {
            System.out.println("File->"+f.getName());
            fw.write("File->"+f.getName()+"\n");
        }
       
        else 
        {
            System.out.println("Unkkown->"+f.getName());
            fw.write("Unkkown->"+f.getName()+"\n");
        }
    }
    fw.flush();
    fw.close();
}

}

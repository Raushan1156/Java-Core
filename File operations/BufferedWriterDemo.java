import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        
    FileWriter fw=new FileWriter("BufferedWriter.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write(100);
    bw.newLine();
    // bw.write("This is a String.", 1, 10);
    bw.write("This is a String.");
    bw.newLine();
    char ch[]={'a','b'};
    bw.write(ch);


    //it is not required to close explicitly.
    // fw.flush();
    // fw.close();

    bw.flush();
    bw.close();
    }
}

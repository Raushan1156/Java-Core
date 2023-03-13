import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    
    public static void main(String[] args) throws IOException {
     
        
        FileWriter fw=new FileWriter("a.txt");
        PrintWriter pw=new PrintWriter(fw);
        int k=890;
        pw.write(100);
        pw.println();
        pw.write(k);
        pw.print(10.235);

        char []ch={'a','b'};
        pw.write(ch);
        pw.write("It is String.");

        pw.print(10000);
        pw.println(1022.365);

    
        pw.flush();
        pw.close();

;    }
}

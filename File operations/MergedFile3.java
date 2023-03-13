import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergedFile3 {
    
    public static void main(String[] args) throws IOException{
        
        // PrintWriter pw=new PrintWriter("MergedFile3.txt");
        PrintWriter pw=new PrintWriter("file3.txt");
        BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));

        String line=br1.readLine();
        String line2=br2.readLine();
        while((line!=null)||(line2!=null))
        {
            if(line!=null)
            {
            pw.println(line);
            line=br1.readLine();
            }

            if(line2!=null)
            {
                pw.println(line2);
                line2=br2.readLine();
            }
            // pw.println(line);
            // pw.println(line2);
            // line=br1.readLine();
            // line2=br2.readLine();
        }

        //  FileReader fr2=new FileReader("file2.txt");
        //  BufferedReader br2=new BufferedReader(fr2);
        //  String line2=br1.readLine();
        // while(line!=null)
        // {
        //     pw.println(line);
        //     line=br1.readLine();
        // }


        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}

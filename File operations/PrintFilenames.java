import java.io.File;

public class PrintFilenames{
public static void main(String[] args) {
    String path="C:\\All Documents\\Resume & Certification";
    //int count=0 ;
    File file=new File(path);

    String[] arr=file.list();
    System.out.println(file.exists()+"   "+(arr.length+1));
    for(String e:arr)
    {
        // count++;
        // System.out.println(e);

        File f=new File(path,e);
        if(f.isFile())
            System.out.println("File->"+f.getName());
        else if(f.isDirectory())
            System.out.println("Directory->"+e);
        else 
            System.out.println("Not known->"+e);
    }
   // System.out.println(count);
}

}
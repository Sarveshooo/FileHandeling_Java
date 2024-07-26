//TODO: TOTAL NUMBER OF FILES AND FOLDERS IN THE  CURRENT FOLDER
import java.io.*;

class demo
{
    public static void main(String[] args)throws Exception 
    {
        File obj=new File("FileHandeling");////TODO: ABSOLUTE PATH 

        String names[]= obj.list();

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }

}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code5.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo       
Exception in thread "main" java.lang.NullPointerException
        at demo.main(code5.java:12)
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> */

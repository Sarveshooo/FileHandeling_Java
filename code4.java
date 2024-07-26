//TODO: TOTAL NUMBER OF FILES AND FOLDERS IN THE  CURRENT FOLDER
import java.io.*;

class demo
{
    public static void main(String[] args)throws Exception 
    {
        File obj=new File("C:/Users/sarvesh sakpal/Desktop/FileHandeling");////TODO: ABSOLUTE PATH 

        String names[]= obj.list();

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }

}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code4.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo
code1.java
code2.java
code3.java
code4.java
demo.class
demo2.class
JavaFolder
Sarvesh.txt
8
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> */
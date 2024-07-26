
import java.io.*;

class demo
{
    public static void main(String[] args)throws Exception 
    {
        File obj=new File("./../FileHandeling");////TODO: ABSOLUTE PATH ANOTHER WAY OF WRITING ADDRESS

        String names[]= obj.list();

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }
}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code6.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo       
code1.java
code2.java
code3.java
code4.java
code5.java
code6.java
demo.class
demo2.class
JavaFolder
Sarvesh.txt
10
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling>  */

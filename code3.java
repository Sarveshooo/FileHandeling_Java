//TODO: BY THIS CODE WE HAVE MADE A FOLDER JavaFolder and made a File JavaFile.java in it 
import java.io.*;

class demo
{
    public static void main(String[] args)throws Exception
    {
        File obj=new File("JavaFolder");
        obj.mkdir();

        File obj3=new File(obj,"JavaFile.java");
        obj3.createNewFile();
    }
}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code3.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo 
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> ls


    Directory: C:\Users\sarvesh sakpal\Desktop\FileHandeling


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----        20-07-2024     22:18                JavaFolder
-a----        20-07-2024     22:12            462 code1.java
-a----        20-07-2024     22:14           2313 code2.java
-a----        20-07-2024     22:19            257 code3.java
-a----        20-07-2024     22:19            533 demo.class
-a----        20-07-2024     22:18            534 demo2.class
-a----        20-07-2024     22:14              0 Sarvesh.txt


PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> */
import java.io.*;
class demo
{
    public static void main(String[] args)throws Exception 
    {
        File obj=new File("Sarvesh.txt");
        obj.createNewFile();
        
    }
}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code2.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo     
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> ls


    Directory: C:\Users\sarvesh sakpal\Desktop\FileHandeling


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----        20-07-2024     22:08            173 code1.java
-a----        20-07-2024     22:10            193 code2.java
-a----        20-07-2024     22:11            426 demo.class
-a----        20-07-2024     22:11              0 Sarvesh.txt


PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> */


////////////IF YOU REMOVE THE FILE 

/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code2.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo       
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> ls              


    Directory: C:\Users\sarvesh sakpal\Desktop\FileHandeling


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----        20-07-2024     22:12            462 code1.java
-a----        20-07-2024     22:13            876 code2.java
-a----        20-07-2024     22:13            426 demo.class
-a----        20-07-2024     22:13              0 Sarvesh.txt


PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> rm Sarvesh.txt  
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> ls


    Directory: C:\Users\sarvesh sakpal\Desktop\FileHandeling


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----        20-07-2024     22:12            462 code1.java
-a----        20-07-2024     22:13            876 code2.java
-a----        20-07-2024     22:13            426 demo.class


PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code2.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo     
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> ls


    Directory: C:\Users\sarvesh sakpal\Desktop\FileHandeling
 */


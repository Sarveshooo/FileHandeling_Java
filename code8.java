//TODO: CODE TO WRITE IN A FILE (WHICH IS ALREADY CREATED Sarvesh.txt)
import java.io.*;
class demo
{
    public static void main(String[] args)throws Exception 
    {
        FileWriter obj=new FileWriter("Sarvesh.txt");
        obj.write("Hello World");
        obj.write("Flutter");
        obj.write("React");
        obj.write("SpringBoot");


        obj.close();
        
    }
}
/* PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code8.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> vim Sarvesh.txt 
TODO: OPEN THE Sarvesh.txt 
Hello WorldFlutterReactSpringBoot
*/
import java.io.*;
class demo
{
    public static void main(String[] args) throws Exception 
    {
        FileWriter obj=new FileWriter("NewFile.txt");
        obj.write("Hello World");

        
        ///obj.close();////TODO: IF YOU DONT CLOSE THE FILE IT COMPILES AND RUNS BUT NOTHING GETS WRITEN IN THE FILE
        
    }

}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code10.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> vim .\NewFile.txt */
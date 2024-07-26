import java.io.*;

class demo
{
    public static void main(String[] args) {
        
        File obj=new File("Sarvesh.txt");
        obj.createNewFile();
    }
}
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code1.java
code1.java:8: error: unreported exception IOException; must be caught or declared to be thrown
        obj.createNewFile();
                         ^
1 error
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling>
 */
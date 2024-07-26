//TODO: CODE FOR WHAT HAPPENS IF YU THOWS ONLY IOEXCEPTION ON A CREATION OF NEW FILE 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class demo
{
    public static void main(String[] args)throws IOException
    {
        FileReader obj=new FileReader("Khatarnak.txt");

    }
    /*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code13.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo
Exception in thread "main" java.io.FileNotFoundException: Khatarnak.txt (The system cannot find the file specified)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileReader.<init>(Unknown Source)
        at demo.main(code13.java:9)
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling>  */

}

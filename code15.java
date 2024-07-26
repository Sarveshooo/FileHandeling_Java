///TODO: CODE FOR READING A FILE 
import java.io.*;
class demo{
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new FileReader("Sarvesh.txt");

        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fr.close();

}
}

import java.io.*;

class demo
{
    public static void main(String[] args)throws Exception 
    {
        FileWriter obj=new FileWriter("Sarvesh.txt",true);//TODO: HERE TRUE STANDS FOR THE APPEND FLAG AND APPENDS THE CURRENT FILE INTO TH PREVOIUS FILE
        obj.write("Hello World\n");
        obj.write("HERE TRUE STANDS FOR THE APPEND FLAG AND APPENDS THE CURRENT FILE INTO TH PREVOIUS FILE");
        obj.close();
        
    }

}
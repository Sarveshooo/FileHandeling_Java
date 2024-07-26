//TODO: CODE TO WRITE IN A FILE (WHICH IS  NOT ALREADY CREATED Sarvesh.txt)

import java.io.FileWriter;

class demo
{
    public static void main(String[] args) throws Exception 
    {
        FileWriter obj=new FileWriter("abc.txt");///TODO: EVEN A NEW FILE CAN BE CREATED OR A PREVIOUS FILE CAN BE OVVERIDEN
        obj.write("Hello World");
        obj.write("This Is A New File");

        obj.close();////TODO: IF YOU DONT CLOSE THE FILE IT COMPILES AND RUNS BUT NOTHING GETS WRITEN IN THE FILE 

        
    }

}
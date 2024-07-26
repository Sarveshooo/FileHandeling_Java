/*TODO: WHAT HAPPENS IF YOU WRITE IN A TEXT FILE Sarvesh.txt WHICH ALREADY CONTAINS 
 * Hello WorldFlutterReactSpringBoot       {Sarvesh.txt}
 * TODO: OVERWRITING A ALREADY WRITEN FILE 
 */

import java.io.FileWriter;

class demo
 {
    public static void main(String[] args) throws Exception 
    {
        FileWriter obj=new FileWriter("Sarvesh.txt");
        obj.write("JAI SHIVAJI JAI BHAVANI\n ");
        obj.close();
        

    }
/*PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code11.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java demo        
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> vim Sarvesh.txt  
TODO: JAI SHIVAJI JAI BHAVANI (NEW COMPILED FILE)
 */
 }
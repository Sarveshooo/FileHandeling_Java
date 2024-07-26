//TODO: SERIALIZATION AND DISERALIZATION IN JAVA 

import java.io.*;

class employee implements Serializable
{
    int empid;
    String empname;
    employee(int empid,String empname)
    {
        this.empid=empid;
        this.empname=empname;
    }
}
class SerialDemo
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("EmployeeData.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        employee obj1=new employee(1,"KANHA");
        employee obj2=new employee(2,"RAHUL");
        employee obj3=new employee(3,"RAJ");

        oos.writeObject(obj3);
        oos.writeObject(obj2);
        oos.writeObject(obj1);
        oos.close();
        fos.close();

        
    }
}
/*C:\Users\sarvesh sakpal\Desktop\FileHandeling> javac code16.java
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> java SerialDemo
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> vim EmployeeData.txt
¬í^@^Esr^@^Hemployee#µ^\¼^E¿Æ\^B^@^BI^@^EempidL^@^Gempnamet^@^RLjava/lang/String;xp^@^@^@^Ct^@^CRAJsq^@~^@^@^@^@^@^Bt^@^ERAHULsq^@~^@^@^@^@^@^At^@^EKANHA */
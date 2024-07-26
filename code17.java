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
class DeserialDemo
{
    public static void main(String[] args)throws Exception 
    {
        FileInputStream fis=new FileInputStream("EmployeeData.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        employee e1=(employee)ois.readObject();
        employee e2=(employee)ois.readObject();
        employee e3=(employee)ois.readObject();

        System.out.println(e1.empid);
        System.out.println(e1.empname);
        System.out.println(e2.empid);
        System.out.println(e2.empname);  
        System.out.println(e3.empid);
        System.out.println(e3.empname);
    }
}
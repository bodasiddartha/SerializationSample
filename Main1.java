import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;


public class Main1{
    public static void main(String[] args) {
        

        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream("person.ser"));
            Person p = (Person) oos.readObject();
            System.out.println(p.getName());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
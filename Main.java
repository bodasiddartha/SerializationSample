import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    String name; 
    int id;

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
}


public class Main{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("bsiddartha");
        p.setID(1);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
            oos.writeObject(p);
            System.out.println("serialized to person.ser");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
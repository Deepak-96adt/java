import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializableInterface {
    public static void main(String[] args) {
        Student student = new Student("Deepak upadhyay", 26);

        // Create a FileOutputStream to write the serialized object to a file
        try {
            FileOutputStream fs = new FileOutputStream("user.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(student);
            os.close();
            fs.close();
            System.out.println("student object has been serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

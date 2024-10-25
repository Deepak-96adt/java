import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("user.ser");
            ObjectInputStream os = new ObjectInputStream(fs);

            Student student = (Student) os.readObject();
            fs.close();
            os.close();
            System.out.println("name : "+student.name);
            System.out.println("name : "+student.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
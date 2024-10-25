import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter writerObj = new FileWriter("Example.txt");
            writerObj.write("my name is Deepak upadhyay");; 
            writerObj.close();
            System.out.println("wrote file successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

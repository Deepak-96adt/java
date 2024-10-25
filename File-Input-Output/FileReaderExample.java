import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            System.out.println("File exists : "+file.exists());   //true
            System.out.println("Lenght of file String : "+file.length());
            System.out.println("file path : "+file.toPath());
            // System.out.println(file.createNewFile());
            // System.out.println(file.delete());
        
            FileReader fr = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(fr);
            String fileContent;
            while ((fileContent=br.readLine())!=null) {
                System.out.print(fileContent);
            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

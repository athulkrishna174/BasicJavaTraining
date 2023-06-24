import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        try {

            File file = new File("./test.txt");

            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Hi... I'Am Athul Krishna");
            dos.close();

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            String content = dis.readUTF();
            dis.close();

            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

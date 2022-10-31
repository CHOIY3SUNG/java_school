import java.io.*;

public class FileOExam {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("data.dat");
        fos.write(740);
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        int data = fis.read();

        System.out.println(data);
    }
}

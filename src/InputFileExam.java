import java.io.*;

public class InputFileExam {
    public static void streamTest(InputStream is) {
        try {
            while(true){
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("large_in.txt");
        streamTest(fis);
        if(fis != null)
            fis.close();
    }
}

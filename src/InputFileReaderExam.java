import java.io.*;

public class InputFileReaderExam {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("large_in.txt");
            Reader reader = new InputStreamReader(fis);
            while(true){
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
            fis.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}


import java.io.*;

public class BufferedInputExam {
    public static void main(String[] args) {
        // try 괄호 안에 스트림을 선언하면, try가 끝나고 자동으로 close() 된다.
        try (Reader is = new BufferedReader( new InputStreamReader(
                new FileInputStream("large_in.txt")))){
            while(true){
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}
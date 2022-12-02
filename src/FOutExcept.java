import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FOutExcept {
    public static void main(String[] args) {
        FileReader fw = null;
        try {
            fw = new FileReader("output. txt");
            int ch;
            while ((ch = fw.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        }catch (IOException e) {
            System.err.println("IOException이 발생하였습니다. ");
            e.printStackTrace();
        }finally{
            System.out.println("예외 여부와 관계 없이 무조건 실행되는 finally 구문");
        }
        System.out.println("FOutExcept. java 실행 완료!");
    }
}

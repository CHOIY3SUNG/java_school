import java.io.*;

public class FileExam1 {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("datar.txt");
            FileWriter fw = new FileWriter("dataw.txt");
            int c;
            while((c= fr.read()) != -1){
                fw.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("이거 출력되나?");
    }
}

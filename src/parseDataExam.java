import java.util.Scanner;

public class parseDataExam {
    public static void main(String[] args) {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        float sum=0;
        double average = 0;

        System.out.print("A: ");
        a=scanner.nextLine();
        System.out.print("B: ");
        b=scanner.nextLine();
        System.out.println("input data : " + a + " " + b);

        float c = Float.parseFloat(a);
        float d = Float.parseFloat(b);
        sum = c+d;
        average = sum/2;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println("평균 = " + average);
    }
}

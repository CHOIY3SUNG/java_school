public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("today is rainy");
        StringBuffer sb2 = null;
        sb2 = sb1.replace(9, 14, "sunny");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
    }
}

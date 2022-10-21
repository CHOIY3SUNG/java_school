public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "ABVEFDAFD";
        int i = 10;
        char charr[] = new char[] {'a', 'b'};

        String export = String.valueOf(ch) + i;
        System.out.println(export);
        System.out.println(export.getClass().getName());
    }
}

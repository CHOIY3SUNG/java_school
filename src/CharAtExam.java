public class CharAtExam {
    public static void main(String[] args) {
        String str = "I love Korea";

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}

public class EqualExam {
    public static void main(String[] args) {
        String str1 = "Hansei";
        String str2 = "Hansei";
        String str3 = new String("Hansei");
        String str4 = new String("Hansei");

        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);

        if(str1 == str2){
            System.out.println("같은 녀석임");
        } else {
            System.out.println("같은 녀석이 아닌 도플갱어");
        }

        if(str3 == str4){
            System.out.println("같은 녀석임");
        } else {
            System.out.println("같은 녀석이 아닌 도플갱어");
        }

        if(str3.equals(str4)){
            System.out.println("내용이 같음");
        } else {
            System.out.println("내용이 다름");
        }
    }
}

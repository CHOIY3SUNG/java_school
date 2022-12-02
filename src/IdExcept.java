import java.util.ArrayList;
import java.util.List;

public class IdExcept {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("문자열 추가");

        System.out.println(list.get(0));
        System.out.println(list.get(1)); // IndexOutOfBoundsException
    }
}

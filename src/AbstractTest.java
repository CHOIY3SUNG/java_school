public class AbstractTest {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int a = 10, b = 20, res = 0;

        A_Test test1 = new A_Test();
        res=test1.add(a,b);
        System.out.println(res);

    }
}

class A_Test extends B_test{
    public int add(int a, int b){
        return a+b;
    }
}

abstract class B_test {
    public abstract int add(int a, int b);
}

package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String str) {
        System.out.println("시작");
        System.out.println(str);
        System.out.println("종료");
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}

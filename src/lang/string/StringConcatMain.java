package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 문자열 concat은 너무 자주 일어나므로 + 연산으로 concat을 지원한다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}

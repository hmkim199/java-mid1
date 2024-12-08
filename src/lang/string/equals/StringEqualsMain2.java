package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
//        return x == y; // 매개변수 문자열이 리터럴로 만들어졌는지, new String으로 만들어졌는지 알 수 없으므로 사용하지 말 것.
        return x.equals(y);
    }
}

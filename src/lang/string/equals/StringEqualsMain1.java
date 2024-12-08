package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // String은 equals 오버라이딩되어서 값으로 비교함.

        String str3 = "hello"; // 실행 전 클래스 정보 읽어들일때 미리 만들어짐.
        String str4 = "hello"; // 같은 문자열이 문자열 풀에 있으므로 생성되지 않음.
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true. 문자열 리터럴을 사용하면 같은 참조값 가짐.
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}

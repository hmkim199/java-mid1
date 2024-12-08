package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // str = hello

        String str1 = "hello";
        String str2 = str1.concat(" java"); // 불변 객체를 변경할 땐 반환 값이 있다!!!!
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2); // str = hello
    }
}

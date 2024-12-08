package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java"};
        int sum = 0;
        for (String string : arr) {
            System.out.println("string.length() = " + string.length());
            sum += string.length();
        }
        System.out.println("sum = " + sum);
    }
}

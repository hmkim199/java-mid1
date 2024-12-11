package lang.wrapper.ex;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.valueOf(str);
        int i2 = i.intValue();
        Integer i3 = Integer.valueOf(i2);
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}

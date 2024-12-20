package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 내부 클래스는 바깥 클래스의 참조를 알아야 하므로!
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}

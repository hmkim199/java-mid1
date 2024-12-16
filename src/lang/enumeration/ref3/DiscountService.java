package lang.enumeration.ref3;
public class DiscountService { // 삭제해도 됨
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}

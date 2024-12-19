package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 10, 7);
        System.out.println("now = " + now);
        System.out.println("ofDate = " + ofDate);

        //계산 (불변)
        LocalDate plus = ofDate.plusDays(10);
        System.out.println("plus = " + plus);
    }
}

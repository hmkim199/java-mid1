package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        LocalDate localDate1 = LocalDate.of(2024, 11, 21);

        Period between = Period.between(localDate, localDate1);
        long between1 = ChronoUnit.DAYS.between(localDate, localDate1);

        System.out.println("localDate = " + localDate);
        System.out.println("localDate1 = " + localDate1);
        System.out.println("between = " + between); // between = P10M20D
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "월 " + between.getDays() + "일");
        System.out.println("between1 = " + between1);

    }
}

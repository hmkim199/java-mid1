package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산
        LocalDate localDate = LocalDate.of(2020, 2, 23);
        LocalDate plus = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plus = " + plus);

        // 기간 차이
        LocalDate localDate1 = LocalDate.of(2023, 1, 1);
        LocalDate localDate2 = LocalDate.of(2024, 1, 1);
        Period between = Period.between(localDate1, localDate2);
        System.out.println("between = " + between);
        System.out.println("기간: " + between.getMonths() + "개월" + between.getDays() + "일");
    }
}

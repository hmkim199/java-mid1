package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2023, 10, 9, 10, 9, 30, 30);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime plusDt = ofDt.plusDays(1000);
        System.out.println("plusDt = " + plusDt);
        LocalDateTime plusYears = ofDt.plusYears(1);
        System.out.println("plusYears = " + plusYears);

        // 비교
        System.out.println("비교 = " + plusYears.isBefore(ofDt));
        System.out.println("비교 = " + plusYears.isAfter(ofDt));
        System.out.println("비교 = " + plusYears.isEqual(ofDt)); // 시간적으로 같은지 비교. 객체 타입, 타임존 달라도 됨
    }
}

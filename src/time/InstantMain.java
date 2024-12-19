package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime now1 = ZonedDateTime.now();
        Instant from = Instant.from(now1);
        System.out.println("from = " + from);

        Instant ofEpochSecond = Instant.ofEpochSecond(1); // 1970년 1월1일로부터 몇초 후
        System.out.println("ofEpochSecond = " + ofEpochSecond);

        //계산
        Instant plusSeconds = ofEpochSecond.plusSeconds(3600);
        System.out.println("plusSeconds = " + plusSeconds);

        //조회
        long epochSecond = plusSeconds.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}

package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 30, 30);
        System.out.println("now = " + now);
        System.out.println("ofTime = " + ofTime);

        //계산(불변)
        LocalTime plusOfTime = ofTime.plusSeconds(30);
        System.out.println("plusOfTime = " + plusOfTime);
    }
}
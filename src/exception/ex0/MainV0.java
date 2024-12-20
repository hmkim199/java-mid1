package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 serviceV0 = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String string = scanner.nextLine();
            if (string.equals("exit")) {
                break;
            }
            serviceV0.sendMessage(string);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}

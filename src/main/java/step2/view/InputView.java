package step2.view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int buyingLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }


}

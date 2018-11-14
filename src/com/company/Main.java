package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.printf("Lottery Number\n");
        System.out.printf("로또 1, 2, 3 을 선택 하세요\n\r");
        System.out.printf("로또 종류 숫자 입력 : ");

        int choiceNumber = sc.nextInt();
        if(choiceNumber == 1)
        {
            Lottery lotto = new Lottery(1,45, 6);
            lotto.LotteryChoice();
            lotto.ShowLotteryNumber();
        }
        else if(choiceNumber == 2)
        {
            Lottery lotto = new Lottery(1,45, 8);
            lotto.LotteryChoice();
            lotto.ShowLotteryNumber();
        }
        else if(choiceNumber == 3)
        {
            Lottery lotto = new Lottery(1,80, 6);
            lotto.LotteryChoice();
            lotto.ShowLotteryNumber();
        }
//        else
//        {
//            System.out.printf("숫자 입력이 잘못 되었습니다.");
//        }

        //lotto.LotteryChoice();
        //lotto.ShowLotteryNumber();

    }
}

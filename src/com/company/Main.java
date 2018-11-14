package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Lottery Number\n");
        System.out.printf("로또 1, 2, 3 을 선택 하세요\n\r");
        System.out.printf("로또 종류 숫자 입력 : ");
        int grade ;
        int choiceNumber = sc.nextInt();

        if(choiceNumber == 1)
        {
            /* 로또 성공 번호 생성 */
            Lottery successNumbers = new Lottery(1,45, 6);
            successNumbers.LotteryChoice(false);


            /* 번호 추첨 */
            Lottery lotto = new Lottery(1,45, 6);
            lotto.LotteryChoice(true);
            successNumbers.ShowLotteryNumber(false);
            lotto.ShowLotteryNumber(true);

            /* 순위 매기기 */
            grade = lotto.GetGrade(choiceNumber, successNumbers.lotteryNumber, lotto.lotteryNumber);
            if(grade == -1)
            {
                System.out.printf("꽝입니다.\n");
            }
            else
            {
                System.out.printf("순위 : %d등 당첨 되었습니다.\n", grade);
            }
        }
        else if(choiceNumber == 2)
        {
            Lottery successNumbers = new Lottery(1,45, 8);
            successNumbers.LotteryChoice(false);

            Lottery lotto = new Lottery(1,45, 8);
            lotto.LotteryChoice(true);
            successNumbers.ShowLotteryNumber(false);
            lotto.ShowLotteryNumber(true);

            grade = lotto.GetGrade(choiceNumber, successNumbers.lotteryNumber, lotto.lotteryNumber);
            if(grade == -1)
            {
                System.out.printf("꽝입니다.\n");
            }
            else
            {
                System.out.printf("순위 : %d등 당첨 되었습니다.\n", grade);
            }

        }
        else if(choiceNumber == 3)
        {
            Lottery successNumbers = new Lottery(1,80, 6);
            successNumbers.LotteryChoice(false);
            successNumbers.ShowLotteryNumber(false);

            Lottery lotto = new Lottery(1,80, 6);
            lotto.LotteryChoice(true);
            successNumbers.ShowLotteryNumber(false);
            lotto.ShowLotteryNumber(true);
            grade = lotto.GetGrade(choiceNumber, successNumbers.lotteryNumber, lotto.lotteryNumber);

            if(grade == -1)
            {
                System.out.printf("꽝입니다.\n");
            }
            else
            {
                System.out.printf("순위 : 1등 당첨 되었습니다.\n");
            }

        }


    }
}

package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery
{
    private int MAX_NUMBER;
    private int MIN_NUMBER;
    private int TOTAL_COUNT;

    private Scanner input = new Scanner(System.in);
    private Random randomNumber = new Random();
    private ArrayList<Integer> lotteryNumber = new ArrayList<>();

    public Lottery(int minNumber, int maxNumber, int totalCount)
    {
        this.MIN_NUMBER= minNumber;
        this.MAX_NUMBER = maxNumber;
        this.TOTAL_COUNT = totalCount;
    }

    public void SelectNumber()
    {
        int temp = randomNumber.nextInt(MAX_NUMBER) + MIN_NUMBER;
        if (lotteryNumber.contains(temp))
        {
            SelectNumber();
        }
        else
        {
            lotteryNumber.add(temp);
            System.out.printf("숫자 : " + String.valueOf(temp) + "\n");
        }
    }

    public void LotteryChoice()
    {
        for (int i = 0; i < TOTAL_COUNT; i++)
        {
            System.out.printf("%d번째 숫자 추첨 (엔터를 입력하세요) :", i + 1);
            input.nextLine();
            this.SelectNumber();
        }
    }

    public void ShowLotteryNumber()
    {
        System.out.printf("로또 추첨번호 : ");
        for (int i = 0; i < this.lotteryNumber.size() ; i++)
        {
            System.out.printf("%d ", this.lotteryNumber.get(i));
        }
    }
}

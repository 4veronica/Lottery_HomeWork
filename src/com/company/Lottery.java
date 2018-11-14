package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

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
    public ArrayList<Integer> lotteryNumber = new ArrayList<>();



    public Lottery(int minNumber, int maxNumber, int totalCount)
    {
        this.MIN_NUMBER= minNumber;
        this.MAX_NUMBER = maxNumber;
        this.TOTAL_COUNT = totalCount;
    }


    public void SelectNumber(Boolean showMessage)
    {
        int temp = randomNumber.nextInt(MAX_NUMBER) + MIN_NUMBER;
        if (lotteryNumber.contains(temp))
        {
            SelectNumber(showMessage);
        }
        else
        {
            lotteryNumber.add(temp);
            if(showMessage)
            {
                System.out.printf("숫자 : " + String.valueOf(temp) + "\n");
            }
        }
    }



    public void LotteryChoice(Boolean showMessage)
    {
        for (int i = 0; i < TOTAL_COUNT; i++)
        {
            if (showMessage)
            {
                System.out.printf("%d번째 숫자 추첨 (엔터를 입력하세요) :", i + 1);
                input.nextLine();
            }
            this.SelectNumber(showMessage);
        }
    }

    public void ShowLotteryNumber(Boolean showMessag)
    {
        if(showMessag)
        {
            System.out.printf("로또 추첨번호 : ");
        }
        else
        {
            System.out.printf("로또 성공번호 : ");
        }

        for (int i = 0; i < this.lotteryNumber.size() ; i++)
        {
            System.out.printf("%d ", this.lotteryNumber.get(i));
        }
        System.out.printf("\n");
    }





    public int GetGrade(int gameType, ArrayList<Integer> successNumbers, ArrayList<Integer> choiceNumbers )
    {
        int sameNumberCount = 0;
        int grade = 0;
        for (int i = 0; i < choiceNumbers.size(); i++)
        {
            if(successNumbers.contains(choiceNumbers.get(i)))
            {
                sameNumberCount += 1;
            }
        }

        if (gameType == 1)
        {
            grade = 6 - sameNumberCount + 1;
            if (grade == 7)
            {
                return -1;
            }
            else
            {
                return grade;
            }
        }
        else if (gameType == 2)
        {
            if (sameNumberCount == 8)
            {
                return 1;
            }
            else if(sameNumberCount == 7 || sameNumberCount == 6)
            {
                return 2;
            }
            else if(sameNumberCount == 5 || sameNumberCount == 4)
            {
                return 3;
            }
            else if(sameNumberCount == 3 || sameNumberCount == 2)
            {
                return 4;
            }
            else if(sameNumberCount == 1)
            {
                return 5;
            }
            else
            {
                return -1;
            }
        }
        else if (gameType == 3)
        {
            if(sameNumberCount == 6)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    return -1;
    }




}

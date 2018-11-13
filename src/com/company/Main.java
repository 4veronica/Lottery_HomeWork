package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private int MIN_NUMBER = 1;
    private int MAX_NUMBER = 45;
    private ArrayList<Integer> lotteryNumber = new ArrayList<Integer>();
    private Random randomNumber = new Random();

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

    public static void main(String[] args) {
	// write your code here

        Main Lottery = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Lottery Number\n");

        for (int i = 0 ; i < 6 ; i++)
        {
            System.out.printf("%d 번째 숫자 추첨 (엔터를 누르시오)", i +1);
            sc.nextLine();

            Lottery.SelectNumber();
        }

        System.out.printf("로또 추첨번호 : ");
        for (int i = 0 ; i < Lottery.lotteryNumber.size() ; i++)
        {
            System.out.printf(Lottery.lotteryNumber.get(i).toString() + " ");
        }
    }
}

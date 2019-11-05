package com.example.lib;

import java.util.Scanner;

public class ChangeSec {

    private Scanner scanner = new Scanner(System.in);
    private int total,hour,minutes,second = 0;

    public int getTotal(int i){

        System.out.printf("請輸入第 %d 時間的 小時數\n",i);

        hour = scanner.nextInt();

        System.out.printf("請輸入第 %d 時間的 分鐘數\n",i);

        minutes = scanner.nextInt();

        System.out.printf("請輸入第 %d 時間的 秒數\n",i);

        second = scanner.nextInt();

        total=hour*3600+minutes*60+second;

        return total;

    }


}

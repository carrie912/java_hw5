package com.example.lib;

import java.util.Scanner;

public class ChangeSec {

    private Scanner scanner = new Scanner(System.in);
    private int total,hour,minutes,second = 0;

    public int getTotal(int i){

        System.out.printf("�п�J�� %d �ɶ��� �p�ɼ�\n",i);

        hour = scanner.nextInt();

        System.out.printf("�п�J�� %d �ɶ��� ������\n",i);

        minutes = scanner.nextInt();

        System.out.printf("�п�J�� %d �ɶ��� ���\n",i);

        second = scanner.nextInt();

        total=hour*3600+minutes*60+second;

        return total;

    }


}

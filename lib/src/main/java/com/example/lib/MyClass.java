package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        ChangeSec changeSec = new ChangeSec();
        int a,b,c;
        a = changeSec.getTotal(1);
        b = changeSec.getTotal(2);
        c=Math.abs(a-b);

        System.out.printf("®É®t¬° %d ¬í",c);
    }
}

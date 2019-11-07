package com.example.homework;

public class HomeWork04 {
    public static void main(String[] avrg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);

        System.out.println("請輸入秒數:");
        int inp = scanner.nextInt();
        int hu = inp / 3600;
        int Min = (inp % 3600) / 60;
        int sec = inp % 60;
        System.out.println(  hu + " 時 " + ""+Min +  " 分 " + sec+ "秒");
    }
}

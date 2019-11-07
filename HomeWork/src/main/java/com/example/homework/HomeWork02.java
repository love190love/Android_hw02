package com.example.homework;

public class HomeWork02 {
    public  static  void main(String[] avrg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);

        System.out.println("出生年(西元):");
        int inp1 = scanner.nextInt();

        System.out.println("出生月:");
        int inp2 = scanner.nextInt();

        System.out.println("出生日:");
        int inp3 = scanner.nextInt();

        System.out.println("生日日期:" + inp1 + " " + inp2 + " " + inp3);
    }
}

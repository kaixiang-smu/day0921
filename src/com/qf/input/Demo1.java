package com.qf.input;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        System.out.println(next);
        // 固定格式

        Scanner scanner = new Scanner(System.in);
        // 类名  变量名  =  值
        // 调用方法，开始输入数据
        // scanner.next(); // 扫描输入的字符串
        // scanner.nextInt(); // 扫描输入的int值
        // scanner.nextDouble(); // 扫描输入的double值
        // scanner.nextLine(); // 扫描输入的一行
        String line = scanner.nextLine();
        System.out.println(line);
        int num1 = scanner.nextInt();
        System.out.println(num1);
        double num2 = scanner.nextDouble();
        System.out.println(num2);
        // 关流
        scanner.close();

        // 键盘录入年龄，判断是否可以考驾照
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner1.nextInt();
//        System.out.println(age);
        if(age>=18){
            System.out.println("可以考驾照了");
        }else {
            System.out.println("再等等吧");
        }
    }
}

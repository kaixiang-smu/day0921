package com.qf.ctrl;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        int num=100;
        while (num<1000){
            if (Math.pow(num%10,3)+Math.pow(num/10%10,3)+Math.pow(num/100,3) == num) {
                System.out.print(num + " ");
            }
            num++;
        }
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        while (num1!=0){
            int num2 = num1 % 10;
            System.out.println(num2);
            num1 = num1/10;
        }
    }
}

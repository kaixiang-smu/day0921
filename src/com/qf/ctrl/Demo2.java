package com.qf.ctrl;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * if...else语句
         * if(条件1){
         *    // 执行语句1
         * }else if(条件2){
         *    // 执行语句2
         * }lse if(条件3){
         *    // 执行语句3
         * }...{
         *    // 执行语句n
         * }else{
         *    // 执行语句n+1
         * }
         * ---------执行流程----------
         * 1 先执行到if，判断if后的结果
         * 2 如果结果是true，执行if后语句一，其他else不再执行
         * 3 如果结果是false，跳过语句1，执行下一个elseif中的判断语句
         * 4 如果elseif的结果是true，那就执行其后的{}内的代码
         * 5 如果elseif的结果是false，跳过{}，执行下一个elseif
         * 6 ...依此类推
         * 7 如果所有的if都是false，就执行最后的else
         */
    // 键盘录入一个数，判断是周几
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println("周一");
        }else if (num==2){
            System.out.println("周二");
        }else if (num==3){
            System.out.println("周三");
        }else if (num==4){
            System.out.println("周四");
        }else if (num==5){
            System.out.println("周五");
        }else if (num==6){
            System.out.println("周六");
        }else if (num==7){
            System.out.println("周日");
        }else {
            System.out.println("输入错误，请重新输入");
        }
    }
}

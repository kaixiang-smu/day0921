package com.qf.ctrl;
// if语句
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 执行流程：
         * 1 执行到if时，先判断（）内的条件
         * 2 如果条件为true，就执行{}内的语句
         * 3 如果条件为false，就跳过{}内的语句不执行
         */
        if (false) {
            System.out.println("if执行...");
        }
        /**
         * 1 执行到if，判断（）内的条件
         * 2 如果条件为true，就执行if后{}内的代码，else后不再执行
         * 3 如果条件为false，就执行else后{}内的代码，if后不再执行
         */
        int age = 17;
        if (age>=18){
            System.out.println("可以考驾照");
        } else {
            System.out.println("你还小，再等等");
        }
        // 定义两个变量，输出其中的较大者
        int i = 1;
        int j = 2;
//        System.out.println(i>j?i:j);
        if (i>j){
            System.out.println("i大");
        }else {
            System.out.println("j大");
        }
        // 定义三个变量，输出其中的较大者
        int x = 1;
        int y = 2;
        int z = 3;
//        String r6 = x>y?(x>z?"x最大":"z最大"):(y>z?"y最大":"z最大");
//        System.out.println(r6);
        if (x>y){
            if(x>z){
                System.out.println("x大");
            }else {
                System.out.println("z大");
            }
        }else {
            if(y>z){
                System.out.println("y大");
            }else {
                System.out.println("z大");
            }
        }
        System.out.println("*******判断是否是闰年*********");
        int year = 2024;
        if ((year%4==0 && year%100!=0)||year%400==0) {
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
        System.out.println("*******商场消费返利活动*********");
        double money = 1500.0;
        double dicount_money = money*0.8;
        double end_money;
        if (dicount_money >= 1000){
            end_money = dicount_money - 200;
        }else {
            end_money = dicount_money;
        }
        System.out.println(end_money);
    }
}
